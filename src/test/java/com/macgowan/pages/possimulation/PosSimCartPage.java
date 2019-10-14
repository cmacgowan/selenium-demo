package com.macgowan.pages.possimulation;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by macgowan on 3/21/18.
 */
public class PosSimCartPage extends BasePage
{

    // Page Header

    /**
     * Returns the WebElement for Cart Page Header Element
     *
     * @return {@link WebElement} Page Header Element
     */
    public WebElement getCartPageHeaderElement()
    {
        return driver.findElement(By.id(("pageHeaderCart")));
    }


    // These are the items

    /**
     * Returns the WebElement for component description for Led Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getLedComponentElement()
    {
        return driver.findElement(By.id(("ledComponent")));
    }

    /**
     * Returns the WebElement for component description for Led Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getLedCostElement()
    {
        return driver.findElement(By.id(("ledCost")));
    }



    /**
     * Returns the WebElement for component description for Resistor Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getResistorComponentElement()
    {
        return driver.findElement(By.id(("resistorComponent")));
    }

    /**
     * Returns the WebElement for component cost for Resistor Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getResistorCostElement()
    {
        return driver.findElement(By.id(("resistorCost")));
    }




    /**
     * Returns the WebElement for component description for ic7400 Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getIc7400ComponentElement()
    {
        return driver.findElement(By.id(("ic7400Component")));
    }

    /**
     * Returns the WebElement for component cost for ic7400 Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getIc7400CostElement()
    {
        return driver.findElement(By.id(("ic7400Cost")));
    }





    // Shipping Radio Button

    /**
     * Returns the WebElement for component description for Led Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getShippingUpsGroundElement()
    {
        return driver.findElement(By.id(("shippingUpsGround")));
    }

    /**
     * Returns the component description for Led Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getShippingUpsTwoDayElement()
    {
        return driver.findElement(By.id(("shippingUpsTwoDay")));
    }

    /**
     * Returns the component description for Led Element
     *
     * @return {@link WebElement} Checkbox Led Element
     */
    public WebElement getShippingUpsNextDayElement()
    {
        return driver.findElement(By.id(("shippingUpsNextDay")));
    }


    // Submit Button

    /**
     * Returns the SWebElement for hipping Submit Button Element
     *
     * @return {@link WebElement} Item Submit Button Element
     */
    public WebElement getShippingSubmitButtonElement()
    {
        return driver.findElement(By.id(("shippingSubmitButton")));
    }




}
