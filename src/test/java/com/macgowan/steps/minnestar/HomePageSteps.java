package com.macgowan.steps.minnestar;

import com.macgowan.pages.minnestar.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * This Class will implement the functionality within HomePageSteps that is
 * described in the Cucumber Feature file.
 */
public class HomePageSteps
{

    HomePage homePage = new HomePage();

    /**
     * Returns the Previous element
     *
     * @throws Throwable
     */
    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable
    {
        homePage.init();
        homePage.navigateToHomePage();
    }

    /**
     * Returns the Previous element
     *
     * @throws Throwable
     */
    @When("^I click on the Session link$")
    public void i_click_on_the_session_link() throws Throwable
    {
        homePage.getSubmitASessionElement().click();
    }

}
