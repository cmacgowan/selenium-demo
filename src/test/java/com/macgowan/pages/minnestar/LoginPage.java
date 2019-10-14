package com.macgowan.pages.minnestar;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * The LoginPage Class will support the Login Page. This class will provide
 * access to web elements on the page and helper methods.
 */
public class LoginPage extends BasePage
{

    /////////////////////////////////////////////////////////
    // Element Selector
    /////////////////////////////////////////////////////////

    /**
     * Returns the User Name Element
     *
     * @return {@link WebElement} User Name Element
     */
    public WebElement getUserNameElement()
    {
        return driver.findElement(By.id(("participant_session_email")));
    }

    /**
     * Returns Password Element
     *
     * @return {@link WebElement} Password Element
     */
    public WebElement getPasswordElement()
    {
        return driver.findElement(By.id(("participant_session_password")));
    }

    /**
     * Returns the Logon Button Element
     *
     * @return {@link WebElement} Logon Button Element
     */
    public WebElement getLogonButtonElement()
    {
        // return driver.findElement(By.cssSelector(".actions > ol:nth-child(1) > button:nth-child(1)"));
        return driver.findElement(By.linkText("Log in"));
    }

    /////////////////////////////////////////////////////////
    // Helper Methods
    /////////////////////////////////////////////////////////

}
