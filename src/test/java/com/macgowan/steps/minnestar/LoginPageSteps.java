package com.macgowan.steps.minnestar;

import com.macgowan.pages.minnestar.LoginPage;
import cucumber.api.java.en.When;

/**
 * This Class will implement the functionality within LoginPageSteps that is
 * described in the Cucumber Feature file.
 */
public class LoginPageSteps
{

    LoginPage loginPage = new LoginPage();

    /**
     * Returns the Previous element
     *
     * @throws Throwable
     */
    @When("^I am able to Logon to the system$")
    public void i_am_able_to_logon_to_the_system() throws Throwable
    {
        loginPage.getUserNameElement().sendKeys("minnebar_username_here");
        loginPage.getPasswordElement().sendKeys("minnesbar_password_here");
        loginPage.getLogonButtonElement().click();

        // Validate here and close

        try
        {
            System.out.println("Sleeping ...");
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Danger: Timer failed");

        }


        loginPage.getWedDriver().close();
        loginPage.getWedDriver().quit();


    }

}
