@Home @All
Feature: As a potential client i need to do several operations on shop tab

  Background:
    Given The client is on testing page
    When The client tap on Shop menu

  @Home1
  Scenario Outline: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    And The client tap on Home menu
    And The client see Three Arrivals
    And The client enter to an Arrival
    And should navigate to next page
    And Click on the Add To Basket button
    And check Book in the Menu Item
    And click on Item link
    And user can find total and subtotal values
    And total is always major subtotal
    And click on Proceed to Check out button
    And  User can view billing details
    And user can fill his details in billing details <firstName>,<lastName>,<companyName>,<email>,<phone>,<country>, <address>,<town>, <state>,<postcode>
    Then can opt any payment in the payment gateway
    Examples:
      | firstName | lastName | companyName | email           | phone         | country   | address | town      | state | postcode |
      | Pepito    | Clavito  | Pepito's    | pepito@mail.com | +541115015111 | Argentina | Cucuy   | Carpinchi | Chaco | 1200     |

  @Home2
  Scenario Outline: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
    And The client tap on Home menu
    And The client see Three Arrivals
    And The client enter to an Arrival
    And should navigate to next page
    And Click on the Add To Basket button
    And check Book in the Menu Item
    And click on Item link
    And user can find total and subtotal values
    And total is always major subtotal
    And click on Proceed to Check out button
    And  User can view billing details
    And user can fill his details in billing details <firstName>,<lastName>,<companyName>,<email>,<phone>,<country>, <address>,<town>, <state>,<postcode>
    And can opt any payment in the payment gateway
    And click on Place Order button
    Then user navigates to Order confirmation page
    Examples:
      | firstName | lastName | companyName | email           | phone         | country   | address | town      | state | postcode |
      | Pepito    | Clavito  | Pepito's    | pepito@mail.com | +541115015111 | Argentina | Cucuy   | Carpinchi | Chaco | 1200     |