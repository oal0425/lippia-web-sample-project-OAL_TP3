@Home @All
Feature: HomePage


  Background:
    Given The client is on testing page
    When The client tap on Shop menu

  @Home1
  Scenario: Home Page with three sliders only
    And The client tap on Home menu
    Then The client see Three Sliders

  @Home2
  Scenario: Home Page with three arrivals only
    And The client tap on Home menu
    Then The client see Three Arrivals

  @Home3
  Scenario: Home Page with three arrivals only
    And The client tap on Home menu
    Then The client enter to an Arrival