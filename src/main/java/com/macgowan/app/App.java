package com.macgowan.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by macgowan on 3/21/17.
 *
 *
 * mvn exec:java -Dexec.mainClass=App
 *
 * mvn exec:java -Dexec.mainClass=com.macgowan.app.App
 *
 *
 */
public class App
{

    /**
     * Returns the Previous Date Range button from the calendar navigation bar menu.
     *
     * @return void
     */
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Start the Selenium Test");

        // I had the similar problem running Selenium Webdriver 2.53.0 with Firefox 47.0.
        // Selenium Webdriver 2.53.0 works with Firefox 46.0. You can find the the mentioned
        // version at https://support.mozilla.org/en-US/kb/install-older-version-of-firefox.

        //Step 1- Driver Instantiation: Instantiate driver object as FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        //Step 2- Navigation: Open a website
        driver.navigate().to("http://minnestar.org/minnebar/");

        // Go to session page
        WebElement element = driver.findElement(By.id(("maxbutton-27-container")));
        element.click();

        // Log on to page
        WebElement logInElement = driver.findElement(By.linkText("Log in"));
        logInElement.click();

        // Enter the username
        WebElement userElement = driver.findElement(By.id(("participant_session_email")));
        userElement.sendKeys("chris@macgowan.com");

        // Enter the password
        WebElement passwordElement = driver.findElement(By.id(("participant_session_password")));
        passwordElement.sendKeys("airPowerB5212@!");

        WebElement logInElement2 = driver.findElement(By.cssSelector(".actions > ol:nth-child(1) > button:nth-child(1)"));
        logInElement2.click();

        try
        {
            System.out.println("Sleeping ...");
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Danger: Timer failed");

        }

        //Step 3- Assertion: Check its title is correct
        //assertEquals method Parameters: Message, Expected Value, Actual Value
        //Assert.assertEquals("Title check failed!", "Teknosa Alışveriş Sitesi - Herkes İçin Teknoloji", driver.getTitle());

        //Step 4- Close Driver
        driver.close();

        //Step 5- Quit Driver
        driver.quit();
    }
}
