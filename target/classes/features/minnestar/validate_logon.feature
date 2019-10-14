Feature: Minnestar Webpage
  As a user
  I want to validate the Minnestar Webpage
  So that I can trust the page for goodness

  Scenario: validate the logon
    Given I am on the home page
    When I click on the Session link
    And I click on the Logon link
    Then I am able to Logon to the system


    Given User is on Home Page
    When User Navigate to LogIn <Date 1> Page <Date 2>
    And User enters Credentials to LogIn
      | Date 1     | Date 2    |
      | testuser_1 | Test@153 |
      | testuser_1 | Test@153 |
      | testuser_1 | Test@153 |
      | testuser_1 | Test@153 |
    Then Message displayed Login Successfully
