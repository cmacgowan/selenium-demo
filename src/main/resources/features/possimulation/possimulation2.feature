
Feature: Point Of Sale Simulation
  As a user
  I want to validate the Point Of Sale Simulation
  So that I can buy a product with my credit card

  @Regression2
  Scenario Outline: validate the possim multi-item Workflow with outline
    Given I open the bluerayon test application using possim
    When I logon to the system using the following values:
      | Username     | Password     |
      | <username>   | <password>   |
    And The item page is displayed
    Then Select the Electronic Component using the following values:
      | ComponentName    |
      | <component_name> |
    Then The Cart Page is displayed
    And Verify the Electronic Component selection data using the following values:
      | ComponentName    | ComponentDescription    | ComponentCost    |
      | <component_name> | <component_description> | <component_cost> |
    Then Select the Shipping mode using the following values:
      | ShippingMode    |
      | <shipping_mode> |
    Then Verify the Payment Page is displayed
    And Verify the component data on the Payment Page using the following values:
      | ComponentName | ComponentDescription | ComponentCost |
      | <component_name> | <component_description> | <component_cost> |
    And Verify the Cost Summary on the Payment Page using the following values:
      | SubTotal   | ShippingCost    | FederalTaxes    | StateTaxes    | FeeService     | TotalCost    |
      | <subtotal> | <shipping_cost> | <federal_taxes> | <state_taxes> | <fee_service>  | <total_cost> |
    When I enter the credit card payment information
      | creditcard_number | name_on_credit_card | expiration_date | secret_code |
      | 4324765419871122  | Christopher S. Bill | 12-22-2019      | 2431        |

    Examples:
      | username              | password    | component_name | component_description | component_cost | shipping_mode | subtotal | shipping_cost | federal_taxes | state_taxes | fee_service  | total_cost |
      | cmacgowan             | password45! | led            | LED                   | 20.56          | UpsGround     |  20.56   | 14.99         | 1.4392        | 0.6168      | 10.99        | 48.596     |
      | cmacgowan             | password45! | Resistor       | Resistor              | 00.99          | UpsGround     |  0.99    | 14.99         | 0.0693        | 0.0297      | 10.99        | 27.069     |
      | cmacgowan             | password45! | Ic7400         | IC 7400               | 00.67          | UpsGround     |  0.67    | 14.99         | 0.0469        | 0.0201      | 10.99        | 26.717     |





