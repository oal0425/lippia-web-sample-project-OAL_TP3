@Shop @All
Feature: As a potential client i need to do several operations on shop tab

  Background:
    Given The client is on testing page
    When The client tap on Shop menu

  @Shop1
  Scenario Outline: Shop-Add to Basket-View Basket through Item link
    And click on the add to basket button
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


  @Shop2
  Scenario: Shop-Add to Basket-View Basket-Tax Functionality
    And click on the add to basket button
    And check Book in the Menu Item
    And click on Item link
    And user can find total and subtotal values
    And total is always major subtotal
    And click on Proceed to Check out button
    And  User can view billing details
    Then Tax rate for indian should be two percent and for abroad it should be five percent
