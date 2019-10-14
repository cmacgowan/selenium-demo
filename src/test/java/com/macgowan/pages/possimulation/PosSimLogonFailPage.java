package com.macgowan.pages.possimulation;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by macgowan on 4/1/18.
 */
public class PosSimLogonFailPage extends BasePage
{

    // Page Header

    /**
     * Returns the WebElement Error Message Logon Failed
     *
     * @return {@link WebElement} Error Message Logon Element
     */
    public WebElement getErrorMessageLogonFailedElement()
    {
        return driver.findElement(By.id(("messageLogonFailed")));
    }

    /**
     * Returns the WebElement Error Message Logon Failed 2
     *
     * @return {@link WebElement} Error Message Logon 2 Element
     */
    public WebElement getErrorMessageLogonFailed2Element()
    {
        return driver.findElement(By.id(("messageLogonFailed2")));
    }

    // Username and Password

    /**
     * Returns the WebElement for User Name Element
     *
     * @return {@link WebElement} User Name Element
     */
    public WebElement getUserNameElement()
    {
        return driver.findElement(By.id(("logon-username")));
    }

    /**
     * Returns WebElement for Password Element
     *
     * @return {@link WebElement} Password Element
     */
    public WebElement getPasswordElement()
    {
        return driver.findElement(By.id(("logon-password")));
    }

    /**
     * Returns the WebElement for Logon Button Element
     *
     * @return {@link WebElement} Logon Button Element
     */
    public WebElement getLogonButtonElement()
    {
        return driver.findElement(By.id(("logon-submit-button")));
    }




}
