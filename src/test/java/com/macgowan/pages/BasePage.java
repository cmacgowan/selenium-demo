package com.macgowan.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by macgowan on 3/24/17.
 */
public class BasePage
{

    protected static WebDriver driver;

    /**
     * Returns the Previous element
     *
     * @return void
     */
    public void init()
    {
        driver = new FirefoxDriver();
    }

    /**
     * Returns the Previous element
     *
     * @return {@link WebElement} Previous element
     */
    public WebDriver getWedDriver()
    {
        return driver;
    }
}
