Feature: Point Of Sale Simulation
  As a user
  I want to validate the Point Of Sale Simulation
  So that I can buy a product with my credit card

  @Regression
  Scenario: validate the possim multi-item Workflow
    Given I open the bluerayon test application using possim
    When I logon to the system using the following values:
      | Username     | Password     |
      | cmacgowan    | password45!  |
    And The item page is displayed
    Then Select the Electronic Component using the following values:
      | ComponentName |
      | Led           |
      | IC7400        |
      | Resistor      |
    Then The Cart Page is displayed
    And Verify the Electronic Component selection data using the following values:
      | ComponentName | ComponentDescription | ComponentCost |
      | Led           | LED                  | 20.56         |
      | IC7400        | IC 7400              | 00.67         |
      | Resistor      | Resistor             | 00.99         |
    Then Select the Shipping mode using the following values:
      | ShippingMode |
      | UpsGround    |
    Then Verify the Payment Page is displayed
    And Verify the component data on the Payment Page using the following values:
      | ComponentName | ComponentDescription | ComponentCost |
      | Led           | LED                  | 20.56         |
      | IC7400        | IC 7400              | 00.67         |
      | Resistor      | Resistor             | 00.99         |
    And Verify the Cost Summary on the Payment Page using the following values:
      | SubTotal | ShippingCost | FederalTaxes | StateTaxes | FeeService | TotalCost |
      | 22.22    | 14.99        | 1.5554       | 0.6666     | 10.99      | 50.422    |
    When I enter the credit card payment information
      | creditcard_number | name_on_credit_card | expiration_date | secret_code |
      | 4324765419871122  | Christopher S. Bill | 12-22-2019      | 2431        |
