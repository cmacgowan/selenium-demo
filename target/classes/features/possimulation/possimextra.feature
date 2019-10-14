Feature: Point Of Sale Simulation
  As a user
  I want to validate the Point Of Sale Simulation
  So that I can buy a product with my credit card

  @Regression9
  Scenario: validate the possim logon
    Given I open the bluerayon test application using possim
    When I enter the username and password
    And I select on the Logon button
    Then The item page is displayed

  @Regression4
  Scenario: validate the possim LED Workflow
    Given I open the bluerayon test application using possim
    When I enter the username and password
    And I select on the Logon button
    And The item page is displayed
    Then Select the LED Component
    And Click the Submit Button to move to Cart Page
    Then The Cart Page is displayed
    And Verify the LED component and cost
    Then Select the UPS Two Day Shipping mode
    And Click the Submit Button to move to Payment Page
    Then Verify the Payment Page is displayed
    And Verify the LED component and cost on the Payment Page
    And Verify the Cost Summary on the Payment Page
    When I enter the credit card payment information
      | creditcard_number | name_on_credit_card | expiration_date | secret_code |
      | 4324765419871122  | Christopher S. Bill | 12-22-2019      | 2431        |