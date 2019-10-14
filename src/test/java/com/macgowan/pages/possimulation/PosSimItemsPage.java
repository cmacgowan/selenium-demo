package com.macgowan.pages.possimulation;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by macgowan on 3/14/18.
 */
public class PosSimItemsPage extends BasePage
{

    // Page Header

    /**
     * Returns the WebElement for Item Page Header Element
     *
     * @return {@link WebElement} Page Header Element
     */
    public WebElement getItemPageHeaderElement()
    {
        return driver.findElement(By.id(("pageHeaderItems")));
    }


    // These are the items

    /**
     * Returns the WebElement for Item Checkbox Resistor Element
     *
     * @return {@link WebElement} Checkbox Resistor Element
     */
    public WebElement getItemCheckboxResistorElement()
    {
        return driver.findElement(By.id(("selectResistor")));
    }

    /**
     * Returns the WebElement for Item Checkbox IC7400 Element
     *
     * @return {@link WebElement} Checkbox IC7400 Element
     */
    public WebElement getItemCheckboxIC7400Element()
    {
        return driver.findElement(By.id(("selectIc7400")));
    }

    /**
     * Returns the WebElement for Item Checkbox Led Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getItemCheckboxLedElement()
    {
        return driver.findElement(By.id(("selectLed")));
    }

    // This is the submit button

    /**
     * Returns the WebElement for Item Submit Button Element
     *
     * @return {@link WebElement} Item Submit Button Element
     */
    public WebElement getItemSubmitButtonElement()
    {
        return driver.findElement(By.id(("itemSubmitButton")));
    }


}
