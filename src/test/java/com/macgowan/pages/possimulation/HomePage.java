package com.macgowan.pages.possimulation;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by macgowan on 3/14/18.
 */
public class HomePage extends BasePage
{

    /////////////////////////////////////////////////////////
    // Element Selector
    /////////////////////////////////////////////////////////

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
        driver.navigate().to("http://www.bluerayon.com/pocsim.php");
    }

}
