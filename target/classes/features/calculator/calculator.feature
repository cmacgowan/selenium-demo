Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5


  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 4 minus 2
    Then the result should be 2