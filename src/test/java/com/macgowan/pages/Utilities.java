package com.macgowan.pages;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by macgowan on 3/28/18.
 */
public class Utilities
{


    //private static final Log LOGGER = new Log(Utilities.class);

    //private static final PropertiesManager propertiesManager =
            //(PropertiesManager) ApplicationContextProvider.getApplicationContext().getBean("propertiesManager");

    // since we are not supporting the PropertiesManager here and then Spring stuff we are
    // going to hard code some of this stuff
    // Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(oldstring);

    /**
     * Returns an instance of the current date (minus a few minutes to account for server time differences).
     *
     * @return
     */
    public static Date getCurrentDate()
    {
        return moveDate(new Date(), Calendar.MINUTE, -5);
    }

    /**
     * Moves the specified date forward (or backward) by the specified amount.
     *
     * @param date
     * @param calendarField
     * @param amount
     * @return
     */
    public static Date moveDate(Date date, int calendarField, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendarField, amount);

        return calendar.getTime();
    }

    /**
     * Moves the specified date forward by the specified amount accounting for business days.
     *
     * @param startDate     start date
     * @param calendarField calendar field, e.g. Calendar.DAY_OF_MONTH, Calendar.DAY_OF_WEEK, etc.
     * @param amount        amount to move
     * @return date after moving by business days
     */
    public static Date moveDateBusinessDays(Date startDate, int calendarField, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        int t = 0;
        while (t < amount) {
            calendar.add(calendarField, 1);

            if (!(isWeekend(calendar.getTime()))) {
                t++;
            }
        }
        return calendar.getTime();
    }

    /**
     * Returns the specified date formatted into a date display converted for presentation in the application server's
     * timezone.
     *
     * "yyyy-MM-dd HH:mm:ss.S"
     *
     * @param date
     * @return
     */

    /*
    // public static String formatAsDate(Date date)
    // {
        return formatDate(date, propertiesManager.get("format.date"));
    }
    */

    public static String formatAsDate(Date date)
    {
        return formatDate(date, "yyyy-MM-dd");
    }


    /**
     * Returns the specified date formatted into a datetime display converted for presentation in the application
     * server's timezone.
     *
     * @param date
     * @return
     */

    /*
    public static String formatAsDateTime(Date date) {
        return formatDate(date, propertiesManager.get("format.datetime"));
    }
    */

    public static String formatAsDateTime(Date date)
    {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss.S");
    }

    /**
     * Returns the specified time formatted into a time display converted for presentation in the application server's
     * timezone.
     *
     * @param date
     * @return
     */

    /*
    public static String formatAsTime(Date date) {
        return formatDate(date, propertiesManager.get("format.time"));
    }
    */

    public static String formatAsTime(Date date)
    {
        return formatDate(date, "HH:mm:ss.S");
    }




    /**
     * Internal method use to format a {@link Date} object into the specified {@link String} pattern.
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String formatDate(Date date, String pattern)
    {
        // TimeZone timeZone = TimeZone.getTimeZone(propertiesManager.get("appServer.timezone"));
        TimeZone timeZone = TimeZone.getTimeZone("America/Cayman");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }

    /**
     * Attempts to parse the specified string into a {@link Date} object. This method will attempt parsing various
     * different patterns, starting with the most specific and moving to the most general.
     *
     * @param date
     * @return
     */
    public static Date parseDate(String date)
    {
        Date result = null;
        // TimeZone timeZone = TimeZone.getTimeZone(propertiesManager.get("appServer.timezone"));
        TimeZone timeZone = TimeZone.getTimeZone("America/Cayman");
        String[] patternProperties = {"format.datetime", "format.date"};

        for (String patternProperty : patternProperties) {
            // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(propertiesManager.get(patternProperty));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            simpleDateFormat.setTimeZone(timeZone);

            try {
                result = simpleDateFormat.parse(date);
                break;
            } catch (ParseException e) {
                // OK, do nothing
            }
        }

        if (result == null) {
            throw new RuntimeException("Unable to parse date from: " + date);
        }

        return result;
    }

    /**
     * Returns a unique number that is generated by the current time stamp in HHmmss format
     *
     * @return
     */
    public static String getUniqueNumber() {
        return String.valueOf(new Date().getTime()).substring(4);
    }

    /**
     * Returns the first non-null value from the list of arguments. If all arguments are null, null will be returned.
     *
     * @param strings
     * @return
     */
    public static String firstNonNull(String... strings)
    {
        String result = null;
        if (strings != null) {
            for (String s : strings) {
                if (s != null) {
                    result = s;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Accepts a resource location (from the sampleFiles folder) and copies that resource to a temporary location.
     * Returns the canonical path of the file created. Note that this temp file is flagged for deletion upon termination
     * of the JVM -- no manual deletions are necessary.
     * <p>
     * Usage example:
     * <p>
     * FileElement fileElement = ...;<br/> String path = Utilities.createTempFile("/sampleFiles/sample.pdf");<br/>
     * fileElement.setPath(path);
     *
     * @param resource
     * @return
     */
    public static String createTempFile(String resource)
    {
        File tempFile = null;
        InputStream in = null;
        OutputStream out = null;

        try
        {
            String suffix = "." + FilenameUtils.getExtension(resource);
            tempFile = File.createTempFile(RandomStringUtils.randomAlphanumeric(16), suffix);

            out = new FileOutputStream(tempFile);
            in = Utilities.class.getResourceAsStream(resource);

            IOUtils.copy(in, out);
            out.flush();

            return tempFile.getCanonicalPath();
        }
        catch (Exception exc)
        {
            throw new RuntimeException("error creating temp file", exc);
        }
        finally
        {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
            if (tempFile != null)
            {
                tempFile.deleteOnExit();
            }
        }
    }

    /**
     * Returns the specified name string formatted into "LastName, FirstName MiddleName" format
     *
     * @param fullName
     * @return
     */
    public static String formatFullName(String fullName)
    {
        if (fullName == null)
        {
            throw new BaseException("Full Name is not defined");
        }

        String[] tempNameArray = fullName.split("\\s+");

        if (tempNameArray.length == 1)
        {
            return tempNameArray[0];
        }
        else if (tempNameArray.length > 2)
        {
            return tempNameArray[2] + ", " + tempNameArray[0] + " " + tempNameArray[1];
        }
        else
        {
            return tempNameArray[1] + ", " + tempNameArray[0];
        }
    }

    /**
     * Returns the BigDecimal from String
     *
     * @param number number
     * @return BigDecimal value
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    public static BigDecimal parseBigDecimal(String number) throws ParseException {
        return parseBigDecimal(number, 0);
    }

    /**
     * @param number number
     * @param scale  scale of the {@code BigDecimal}. Integer value, that shows decimal digits number
     * @return BigDecimal value
     * @throws ParseException if the beginning of the specified string cannot be parsed.
     */
    public static BigDecimal parseBigDecimal(String number, int scale) throws ParseException {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setParseBigDecimal(true);
        return ((BigDecimal) decimalFormat.parse(number)).setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Returns the capitalized name
     * <p>
     * Here is the example:
     * <p>
     * input = add new charge; output = Add New Charge;
     *
     * @param message - message to capitalize
     * @return capitalized name
     */
    public static String capitalize(String message) {
        return WordUtils.capitalize(message);
    }

    /**
     * Returns random name
     *
     * @param length - random name length
     * @return random name
     */
    public static String getRandomName(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    /**
     * Return file name with extension from file path
     *
     * @param filePath - path to file
     * @return
     */
    public static String getFileNameFromPath(String filePath) {
        Path p = Paths.get(filePath);
        return p.getFileName().toString();
    }

    /**
     * Generate string of domain type. Example: abcd.com
     *
     * @return
     */
    public static String generateDomainAddress() {
        return (RandomStringUtils.randomAlphabetic(4) + ".com").toLowerCase();
    }

    /**
     * Returns whether or not the specified date falls on a Saturday or Sunday.
     *
     * @param date Date object to test. Cannot be null.
     * @return
     */
    public static boolean isWeekend(Date date) {
        if (date == null) {
            return false;
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int day = cal.get(Calendar.DAY_OF_WEEK);
        return day == Calendar.SATURDAY || day == Calendar.SUNDAY;

    }

    /**
     * Comparator to sort dates in descending order
     */
    public static final class DescendingDateComparator implements Comparator<Date>
    {
        @Override
        public int compare(Date o1, Date o2) {
            int returnMe = 0;
            if (o1.before(o2)) {
                returnMe = 1;
            } else if (o1.after(o2)) {
                returnMe = -1;
            }
            return returnMe;
        }
    }

    /**
     * Returns the Date if the pattern is matched in the given dateLabel
     *
     * @param dateLabels  - Text containing dates
     * @param format      - Date format  e.g. dd-MMM-yyyy
     * @param datePattern - Date pattern e.g. (\d{2}-\w{3}-\d{4})
     * @return {@link List <Date>} list of dates
     */
    public static List<Date> findDateValue(List<String> dateLabels, DateFormat format, String datePattern) {
        List<Date> dates = new ArrayList<>();
        if (dateLabels.size() > 0) {
            Pattern pattern = Pattern.compile(datePattern);
            dateLabels.stream().forEach(dateLabel -> {
                Matcher matcher = pattern.matcher(dateLabel);
                while (matcher.find()) {
                    final String group = matcher.group();
                    try {
                        dates.add(format.parse(group));
                    }
                    catch (ParseException pe)
                    {
                        // There is not any logging at this time
                        // LOGGER.error("Unable to parse the date value. ", pe);
                        System.out.println("Unable to parse the date value. pe: "  + pe);
                    }
                }
            });
        }
        return dates;
    }


}
