Feature: Point Of Sale Simulation Logon
  As a user
  I want to validate the Point Of Sale Simulation Logon
  So that I can validate the security

  @RegressionLogon
  Scenario: validate the possim positive logon
    Given I open the bluerayon test application using possim
    When I logon to the system using the following values:
      | Username     | Password     |
      | cmacgowan    | password45!  |
    Then The item page is displayed
    And The application window is closed

  @RegressionLogon
  Scenario: validate the possim negative logon with username
    Given I open the bluerayon test application using possim
    When I logon to the system using the following values:
      | Username     | Password     |
      | baduser      | password45!  |
    Then The logon error page is displayed
    And The application window is closed

  @RegressionLogon
  Scenario: validate the possim negative logon with password
    Given I open the bluerayon test application using possim
    When I logon to the system using the following values:
      | Username     | Password     |
      | cmacgowan    | badpassword  |
    Then The logon error page is displayed
    And The application window is closed

  @RegressionLogon
  Scenario: validate the possim negative logon with username and password
    Given I open the bluerayon test application using possim
    When I logon to the system using the following values:
      | Username     | Password     |
      | baduser      | badpassword  |
    Then The logon error page is displayed
    And The application window is closed