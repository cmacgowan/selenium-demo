package com.macgowan.pages.minnestar;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * The SchedulePage Class will support the Schedule Page. This class will provide
 * access to web elements on the page and helper methods.
 */
public class SchedulePage extends BasePage
{


    /////////////////////////////////////////////////////////
    // Element Selector
    /////////////////////////////////////////////////////////
    /**
     * Returns the Logon Link Element
     *
     * @return {@link WebElement} Logon Link Element
     */
    public WebElement getLogonLinkElement()
    {
        return driver.findElement(By.linkText("Log in"));
    }

    /////////////////////////////////////////////////////////
    // Helper Methods
    /////////////////////////////////////////////////////////


}
