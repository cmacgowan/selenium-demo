package com.macgowan.steps.minnestar;

import com.macgowan.pages.minnestar.SchedulePage;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebElement;

/**
 * This Class will implement the functionality within LoginPageSteps that is
 * described in the Cucumber Feature file.
 */
public class SchedulePageSteps
{

    SchedulePage schedulePage = new SchedulePage();

    /**
     * Returns the Previous element
     *
     * @throws Throwable
     */
    @And("^I click on the Logon link$")
    public void i_click_on_the_logon_link() throws Throwable
    {
        WebElement webElement = schedulePage.getLogonLinkElement();
        webElement.click();

        //schedulePage.getLogonLinkElement().click();
    }


}
