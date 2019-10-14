package com.macgowan.pages.minnestar;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * The HomePage Class will support the Home Page. This class will provide
 * access to web elements on the page and helper methods.
 */
public class HomePage extends BasePage
{


    /////////////////////////////////////////////////////////
    // Element Selector
    /////////////////////////////////////////////////////////

    /**
     * Returns the Schedule element
     *
     * @return {@link WebElement} Schedule element
     */
    public WebElement getSubmitASessionElement()
    {
        // return driver.findElement(By.id(("maxbutton-27-container")));
        // return driver.findElement(By.linkText(("Submit a Session")));

        // return driver.findElement(By.cssSelector(".medium-8 > p:nth-child(4) > a:nth-child(1)"));

        return driver.findElement(By.cssSelector("#menu-item-36 > a"));




    }

    /////////////////////////////////////////////////////////
    // Helper Methods
    /////////////////////////////////////////////////////////

    /**
     * Navigate To Home Page
     *
     * @return void
     */
    public void navigateToHomePage()
    {
        driver.navigate().to("http://minnestar.org/minnebar/");
    }



}
