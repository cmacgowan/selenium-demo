package com.macgowan.steps.possimulator;

import com.macgowan.pages.BaseDataTable;
import com.macgowan.pages.possimulation.PosSimCartPage;
import com.macgowan.pages.possimulation.PosSimItemsPage;
import com.macgowan.pages.possimulation.PosSimPaymentPage;
import com.macgowan.pages.possimulation.PosSimLogonFailPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by macgowan on 3/14/18.
 *
 * Note:
 *
 * When you design the step definitions you want to consider to make them
 * reusable. They should not be mapped to page objects
 *
 */
public class PosSimItemsSteps
{

    PosSimItemsPage posSimItemsPage = new PosSimItemsPage();

    PosSimCartPage posSimCartPage = new PosSimCartPage();

    PosSimPaymentPage posSimPaymentPage = new PosSimPaymentPage();

    PosSimLogonFailPage posSimLogonFailPage = new PosSimLogonFailPage();


    /**
     * Verity the item page is displayed
     *
     * @throws Throwable
     */
    @And("^The item page is displayed$")
    public void logon_validation_page_is_displayed() throws Throwable
    {
        String text = posSimItemsPage.getItemPageHeaderElement().getText();

        // assert text.compareTo("Items") != 0:" Not valid";
        Assert.assertEquals(" Not valid", text, "Items");
    }


    /**
     * Verity the logon error page is displayed
     *
     * @throws Throwable
     */
    @And("^The logon error page is displayed$")
    public void logon_error_page_is_displayed() throws Throwable
    {
        String text = posSimLogonFailPage.getErrorMessageLogonFailedElement().getText();

        // assert text.compareTo("The Logon attempt failed!") != 0:" Not valid";
        Assert.assertEquals(" Not valid", text, "The Logon attempt failed!");
    }

    /**
     * Verity the item page is displayed
     *
     * @throws Throwable
     */
    @And("^The application window is closed$")
    public void close_application_window() throws Throwable
    {
        posSimItemsPage.getWedDriver().close();
    }







    /**
     * Select the LED Component from the list of components
     *
     * @throws Throwable
     */
    @Then("^Select the LED Component$")
    public void select_led_component() throws Throwable
    {
        posSimItemsPage.getItemCheckboxLedElement().click();
    }


    /**
     * Select the Electronic Component using the data table
     *
     * @throws Throwable
     */
    @When("^Select the Electronic Component using the following values:$")
    public void select_electronic_components_using_following_values(DataTable dataTable) throws Throwable
    {
        BaseDataTable itemsSelected = new BaseDataTable(dataTable);

        int count = itemsSelected.getNumberOfRows();

        for (int i = 0; i < count; i++ )
        {
            String itemName = itemsSelected.getValue(i, "ComponentName");

            // Just adding this so people can see what's going on
            Thread.sleep(1000);

            if (itemName.compareToIgnoreCase("led") == 0)
            {
                posSimItemsPage.getItemCheckboxLedElement().click();
            }
            else if (itemName.compareToIgnoreCase("Resistor") == 0)
            {
                posSimItemsPage.getItemCheckboxResistorElement().click();
            }
            else if (itemName.compareToIgnoreCase("IC7400") == 0)
            {
                posSimItemsPage.getItemCheckboxIC7400Element().click();
            }
            else
            {
                System.out.println("Item name is not valid " + itemName);
            }
        }

        posSimItemsPage.getItemSubmitButtonElement().click();
    }


    /**
     * Click the Submit Button to move to Payment Page
     *
     * @throws Throwable
     */
    @And("^Click the Submit Button to move to Cart Page$")
    public void click_submit_button_to_move_to_cart_page() throws Throwable
    {
        posSimItemsPage.getItemSubmitButtonElement().click();
    }



    /**
     * Verity The Cart Page is displayed
     *
     * @throws Throwable
     */
    @Then("^The Cart Page is displayed$")
    public void cart_page_is_displayed() throws Throwable
    {
        String text = posSimCartPage.getCartPageHeaderElement().getText();
        assert text.compareTo("Cart") != 0:" Not valid";
    }


    /**
     * Verity The LED data
     *
     * @throws Throwable
     */
    @And("^Verify the LED component and cost$")
    public void verify_the_LED_component_and_cost() throws Throwable
    {
        String text = posSimCartPage.getLedComponentElement().getText();
        assert text.compareTo("LED") != 0:" Not valid";

        String cost = posSimCartPage.getLedCostElement().getText();
        assert cost.compareTo("20.56") != 0:" Not valid";
    }


    /**
     * Select the Electronic Component using the data table
     *
     * @throws Throwable
     */
    @When("^Verify the Electronic Component selection data using the following values:$")
    public void verify_electronic_component_selection_data(DataTable dataTable) throws Throwable
    {
        BaseDataTable itemsSelected = new BaseDataTable(dataTable);

        int count = itemsSelected.getNumberOfRows();

        for (int i = 0; i < count; i++ )
        {
            String itemName = itemsSelected.getValue(i, "ComponentName");

            String itemDescription = itemsSelected.getValue(i, "ComponentDescription");

            // String itemCost = itemsSelected.getValue(i, "ComponentCost");

            double itemCost = Double.parseDouble(itemsSelected.getValue(i, "ComponentCost"));

            String actualDescription;

            double actualCost;
            double delta = 0;

            // Just adding this so people can see what's going on
            // Thread.sleep(1000);

            if (itemName.compareToIgnoreCase("led") == 0)
            {
                actualDescription = posSimCartPage.getLedComponentElement().getText();
                assert actualDescription.compareTo(itemDescription) != 0:" Led description not valid";

                actualCost = Double.parseDouble(posSimCartPage.getLedCostElement().getText());
                Assert.assertEquals(" Led cost not valid", actualCost, itemCost, delta);
            }
            else if (itemName.compareToIgnoreCase("Resistor") == 0)
            {
                actualDescription = posSimCartPage.getResistorComponentElement().getText();
                assert actualDescription.compareTo(itemDescription) != 0:" Resistor description not valid";

                actualCost = Double.parseDouble(posSimCartPage.getResistorCostElement().getText());
                Assert.assertEquals(" Resistor cost not valid", actualCost, itemCost, delta);
            }
            else if (itemName.compareToIgnoreCase("IC7400") == 0)
            {
                actualDescription = posSimCartPage.getIc7400ComponentElement().getText();
                assert actualDescription.compareTo(itemDescription) != 0:" IC 7400 description not valid";

                actualCost = Double.parseDouble(posSimCartPage.getIc7400CostElement().getText());
                Assert.assertEquals(" Ic7400", actualCost, itemCost, delta);
            }
            else
            {
                System.out.println("Item name is not valid " + itemName);
            }
        }

    }



    /**
     * Click the Submit Button to move to Payment Page
     *
     * @throws Throwable
     */
    @Then("^Select the UPS Two Day Shipping mode$")
    public void select_the_ups_two_day_shipping_mode() throws Throwable
    {
        posSimCartPage.getShippingUpsTwoDayElement().click();
    }


    /**
     * Click the Submit Button to move to Payment Page
     *
     * @throws Throwable
     */
    @And("^Click the Submit Button to move to Payment Page$")
    public void click_submit_button_to_move_to_payment_page() throws Throwable
    {
        posSimCartPage.getShippingSubmitButtonElement().click();
    }


    /**
     * Select the Shipping mode using data from the data table
     *
     * @throws Throwable
     */
    @When("^Select the Shipping mode using the following values:$")
    public void select_shipping_mode(DataTable dataTable) throws Throwable
    {
        BaseDataTable shippingMode = new BaseDataTable(dataTable);

        int count = shippingMode.getNumberOfRows();

        for (int i = 0; i < count; i++ )
        {
            String itemName = shippingMode.getValue(i, "ShippingMode");

            // Just adding this so people can see what's going on
            Thread.sleep(1000);

            if (itemName.compareToIgnoreCase("UpsGround") == 0)
            {
                posSimCartPage.getShippingUpsGroundElement().click();
            }
            else if (itemName.compareToIgnoreCase("UpsTwoDay") == 0)
            {
                posSimCartPage.getShippingUpsTwoDayElement().click();
            }
            else if (itemName.compareToIgnoreCase("UpsNextDay") == 0)
            {
                posSimCartPage.getShippingUpsNextDayElement().click();
            }
            else
            {
                System.out.println("Shipping mode is not valid " + itemName);
            }
        }

        posSimCartPage.getShippingSubmitButtonElement().click();
    }


    /**
     * Verity The Payment Page is displayed
     *
     * @throws Throwable
     */
    @Then("^Verify the Payment Page is displayed$")
    public void verify_payment_page_is_displayed() throws Throwable
    {
        String text = posSimPaymentPage.getPageHeaderPaymentElement().getText();
        assert text.compareTo("Payment") != 0:" Not valid";
    }



    // And Verify the LED component and cost on the Payment Page
    // And Verify the Cost Summary


    /**
     * Verify the LED component and cost on the Payment Page
     *
     * @throws Throwable
     */
    @And("^Verify the LED component and cost on the Payment Page$")
    public void verify_the_led_component_and_cost_on_the_payment_page() throws Throwable
    {
        String text = posSimPaymentPage.getLedComponentElement().getText();
        assert text.compareTo("LED") != 0:" Not valid";

        String cost = posSimPaymentPage.getLedCostElement().getText();
        assert cost.compareTo("20.56") != 0:" Not valid";
    }



    /**
     * Select the Electronic Component using the data table
     *
     * @throws Throwable
     */
    @When("^Verify the component data on the Payment Page using the following values:$")
    public void verify_component_data_on_payment_page(DataTable dataTable) throws Throwable
    {
        BaseDataTable itemsSelected = new BaseDataTable(dataTable);

        int count = itemsSelected.getNumberOfRows();

        for (int i = 0; i < count; i++ )
        {
            String itemName = itemsSelected.getValue(i, "ComponentName");

            String itemDescription = itemsSelected.getValue(i, "ComponentDescription");

            // String itemCost = itemsSelected.getValue(i, "ComponentCost");

            double itemCost = Double.parseDouble(itemsSelected.getValue(i, "ComponentCost"));

            String actualDescription;

            double actualCost;
            double delta = 0;

            // Just adding this so people can see what's going on
            // Thread.sleep(1000);

            if (itemName.compareToIgnoreCase("led") == 0)
            {
                actualDescription = posSimPaymentPage.getLedComponentElement().getText();
                assert actualDescription.compareTo(itemDescription) != 0:" Led description not valid";

                actualCost = Double.parseDouble(posSimPaymentPage.getLedCostElement().getText());
                Assert.assertEquals(" Led cost not valid", actualCost, itemCost, delta);
            }
            else if (itemName.compareToIgnoreCase("Resistor") == 0)
            {
                actualDescription = posSimPaymentPage.getResistorComponentElement().getText();
                assert actualDescription.compareTo(itemDescription) != 0:" Resistor description not valid";

                actualCost = Double.parseDouble(posSimPaymentPage.getResistorCostElement().getText());
                Assert.assertEquals(" Resistor cost not valid", actualCost, itemCost, delta);
            }
            else if (itemName.compareToIgnoreCase("IC7400") == 0)
            {
                actualDescription = posSimPaymentPage.getIc7400ComponentElement().getText();
                assert actualDescription.compareTo(itemDescription) != 0:" IC 7400 description not valid";

                actualCost = Double.parseDouble(posSimPaymentPage.getIc7400CostElement().getText());
                Assert.assertEquals(" Ic7400 cost not valid", actualCost, itemCost, delta);
            }
            else
            {
                System.out.println("Item name is not valid " + itemName);
            }
        }

    }


    /**
     * Verify the LED component and cost on the Payment Page
     *
     * @throws Throwable
     */
    @And("^Verify the Cost Summary on the Payment Page$")
    public void verify_cost_summary_on_the_payment_page() throws Throwable
    {
        String costSubTotal = posSimPaymentPage.getCostSubTotalElement().getText();
        assert costSubTotal.compareTo("12.12") != 0:" Not valid";

        String shippingCost = posSimPaymentPage.getShippingCostElement().getText();
        Assert.assertTrue("Not valid", shippingCost.compareTo("22.78") == 0);

        String federalTaxesCost = posSimPaymentPage.getFederalTaxesCostElement().getText();
        assert federalTaxesCost.compareTo("0.8484") != 0:" Not valid";

        String stateTaxesCost = posSimPaymentPage.getStateTaxesCostElement().getText();
        assert stateTaxesCost.compareTo("0.3636") != 0:" Not valid";

        String feeServiceCost = posSimPaymentPage.getFeeServiceCostElement().getText();
        assert feeServiceCost.compareTo("10.99") != 0:" Not valid";

        String costTotalCost = posSimPaymentPage.getCostTotalCostElement().getText();
        assert costTotalCost.compareTo("47.102") != 0:" Not valid";
    }







    /**
     * Select the Electronic Component using the data table
     *
     * @throws Throwable
     */
    @When("^Verify the Cost Summary on the Payment Page using the following values:$")
    public void verify_cost_summary_on_payment_page_using_datatable(DataTable dataTable) throws Throwable
    {
        BaseDataTable costSummary = new BaseDataTable(dataTable);

        int count = costSummary.getNumberOfRows();

        double costActual = 0.0;
        double costExpected = 0.0;
        double delta = 0.0;

        costActual = Double.parseDouble(posSimPaymentPage.getCostSubTotalElement().getText());
        costExpected = Double.parseDouble(costSummary.getValue("SubTotal"));
        Assert.assertEquals(" SubTotal cost not valid", costActual, costExpected, delta);

        costActual = Double.parseDouble(posSimPaymentPage.getShippingCostElement().getText());
        costExpected = Double.parseDouble(costSummary.getValue("ShippingCost"));
        Assert.assertEquals(" ShippingCost cost not valid", costActual, costExpected, delta);

        costActual = Double.parseDouble(posSimPaymentPage.getFederalTaxesCostElement().getText());
        costExpected = Double.parseDouble(costSummary.getValue("FederalTaxes"));
        Assert.assertEquals(" ShippingCost cost not valid", costActual, costExpected, delta);

        costActual = Double.parseDouble(posSimPaymentPage.getStateTaxesCostElement().getText());
        costExpected = Double.parseDouble(costSummary.getValue("StateTaxes"));
        Assert.assertEquals(" StateTaxes cost not valid", costActual, costExpected, delta);

        costActual = Double.parseDouble(posSimPaymentPage.getFeeServiceCostElement().getText());
        costExpected = Double.parseDouble(costSummary.getValue("FeeService"));
        Assert.assertEquals(" FeeService cost not valid", costActual, costExpected, delta);

        costActual = Double.parseDouble(posSimPaymentPage.getCostTotalCostElement().getText());
        costExpected = Double.parseDouble(costSummary.getValue("TotalCost"));
        Assert.assertEquals(" TotalCost cost not valid", costActual, costExpected, delta);

    }



    /**
     * Enter the credit card payment information using the data table
     *
     * @throws Throwable
     */
    @When("^I enter the credit card payment information$")
    public void enter_the_credit_card_payment_information(DataTable paymentDetails) throws Throwable
    {
        //Write the code to handle Data Table
        List<List<String>> data = paymentDetails.raw();

        posSimPaymentPage.getPaymentCardNumberElement().sendKeys(data.get(1).get(0));

        posSimPaymentPage.getPaymentCardNameOnTheCardElement().sendKeys(data.get(1).get(1));

        posSimPaymentPage.getPaymentCardExpirationDateElement().sendKeys(data.get(1).get(2));

        posSimPaymentPage.getPaymentCardSecretCodeElement().sendKeys(data.get(1).get(3));

        System.out.println("DEBUG - sleeping for 5 seconds");
        Thread.sleep(1000);

        posSimPaymentPage.getPaymentSubmitButtonElement().click();

        System.out.println("DEBUG - sleeping for 5 seconds");

        Thread.sleep(1000);

        posSimPaymentPage.closeBrowser();

    }




}
