package com.macgowan.steps.possimulator;

import com.macgowan.pages.possimulation.HomePage;
import com.macgowan.pages.BaseDataTable;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

/**
 * Created by macgowan on 3/14/18.
 */
public class HopePageSteps
{

    HomePage homePage = new HomePage();

    /**
     * Returns the Previous element
     *
     * @throws Throwable
     */
    @Given("^I open the bluerayon test application using possim$")
    public void open_bluerayon_test_application_using_possim() throws Throwable
    {
        homePage.init();
        homePage.navigateToHomePage();
    }


    /**
     * Logon to the system using hard coded data
     *
     * @throws Throwable
     */
    @When("^I enter the username and password$")
    public void enter_username_and_password() throws Throwable
    {
        homePage.getUserNameElement().clear();
        homePage.getUserNameElement().sendKeys("cmacgowan");

        homePage.getPasswordElement().clear();
        homePage.getPasswordElement().sendKeys("12345");
    }

    /**
     * Logon to the system using the data table
     *
     * @throws Throwable
     */
    @When("^I logon to the system using the following values:$")
    public void logon_to_system_using_following_values(DataTable dataTable) throws Throwable
    {
        BaseDataTable logonValues = new BaseDataTable(dataTable);

        homePage.getUserNameElement().clear();
        homePage.getUserNameElement().sendKeys(logonValues.getValue("Username"));

        homePage.getPasswordElement().clear();
        homePage.getPasswordElement().sendKeys(logonValues.getValue("Password"));

        homePage.getLogonButtonElement().click();
    }

    /**
     * Returns the Previous element
     *
     * @throws Throwable
     */
    @And("^I select on the Logon button$")
    public void select_logon_button() throws Throwable
    {
        homePage.getLogonButtonElement().click();
    }











}
