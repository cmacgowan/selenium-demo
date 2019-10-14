package com.macgowan.pages.possimulation;

import com.macgowan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by macgowan on 3/21/18.
 */
public class PosSimPaymentPage extends BasePage
{

    // Page Header

    /**
     * Returns the WebElement for Payment Page Header Element
     *
     * @return {@link WebElement} Page Header Element
     */
    public WebElement getPageHeaderPaymentElement()
    {
        return driver.findElement(By.id(("pageHeaderPayment")));
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






    // Payment Summary Stuff

    /**
     * Returns the WebElement for cost SubTotal
     *
     * @return {@link WebElement} cost SubTotal
     */
    public WebElement getCostSubTotalElement()
    {
        return driver.findElement(By.id(("costSubTotal")));
    }

    /**
     * Returns the WebElement for shipping Description
     *
     * @return {@link WebElement} shipping Description
     */
    public WebElement getShippingDescriptionElement()
    {
        return driver.findElement(By.id(("shippingDescription")));
    }

    /**
     * Returns WebElement for the shipping Cost
     *
     * @return {@link WebElement} shipping Cost
     */
    public WebElement getShippingCostElement()
    {
        return driver.findElement(By.id(("shippingCost")));
    }


    /**
     * Returns the WebElement for federal Taxes Cost
     *
     * @return {@link WebElement} federal Taxes Cost
     */
    public WebElement getFederalTaxesCostElement()
    {
        return driver.findElement(By.id(("federalTaxesCost")));
    }


    /**
     * Returns the WebElement for state Taxes Cost
     *
     * @return {@link WebElement} state Taxes Cost
     */
    public WebElement getStateTaxesCostElement()
    {
        return driver.findElement(By.id(("stateTaxesCost")));
    }


    /**
     * Returns the WebElement for fee Service Cost
     *
     * @return {@link WebElement} fee Service Cost
     */
    public WebElement getFeeServiceCostElement()
    {
        return driver.findElement(By.id(("feeServiceCost")));
    }


    /**
     * Returns the WebElement for cost Total Cost
     *
     * @return {@link WebElement} cost Total Cost
     */
    public WebElement getCostTotalCostElement()
    {
        return driver.findElement(By.id(("costTotalCost")));
    }

    // Credit Card Information

    /**
     * Returns the WebElement for payment Card Number
     *
     * @return {@link WebElement} payment Card Number
     */
    public WebElement getPaymentCardNumberElement()
    {
        return driver.findElement(By.id(("paymentCardNumber")));
    }

    /**
     * Returns the WebElement for payment Card Expiration Date
     *
     * @return {@link WebElement} payment Card Expiration Date
     */
    public WebElement getPaymentCardExpirationDateElement()
    {
        return driver.findElement(By.id(("paymentCardExpirationDate")));
    }

    /**
     * Returns the WebElement for payment Card Name On The Card
     *
     * @return {@link WebElement} payment Card Name On The Card
     */
    public WebElement getPaymentCardNameOnTheCardElement()
    {
        return driver.findElement(By.id(("paymentCardNameOnTheCard")));
    }

    /**
     * Returns the WebElement for payment Card Secret Code
     *
     * @return {@link WebElement} payment Card Secret Code
     */
    public WebElement getPaymentCardSecretCodeElement()
    {
        return driver.findElement(By.id(("paymentCardSecretCode")));
    }






    // Submit Button

    /**
     * Returns the Payment Submit Button Element
     *
     * @return {@link WebElement} Payment Submit Button Element
     */
    public WebElement getPaymentSubmitButtonElement()
    {
        return driver.findElement(By.id(("payment-submit-button")));
    }



    /**
     * This will close the browser
     *
     * This should be a in the base class or somewhere - but it's time for bed :-)
     *
     * @return {@link WebElement} This will close the browser
     */
    public void closeBrowser()
    {
        driver.close();
    }







}
