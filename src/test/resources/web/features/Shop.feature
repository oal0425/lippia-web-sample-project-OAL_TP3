@Shop @All
Feature: As a potential client i need to filter the products by price

  Background:
    Given The client is on testing page
    When The client tap on Shop menu

  @Shop1
  Scenario: Shop-filter by Price Functionality
    Then The client see Filter By Price

  @Shop2
  Scenario: Shop-Product Categories Functionality
    Then The client taps on Android Category

  @Shop3
  Scenario: Shop-Default Sorting Functionality
    Then The client sees Default Sorting