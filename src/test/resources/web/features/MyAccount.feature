@MyAccount @All
Feature: As a potential client i need to filter the products by price

  Background:
    Given The client is on testing page
    When The client taps on My Account menu

  @MyAccount1
  Scenario Outline: My Account Dashboard

    And Enter a registered username <username>
    And Enter a registered password <password>
    And Click on login button
    And User must successfully login to the web page
    And Click on MyAccount link
    Then User must view Dashboard of the site

    Examples:
      | username            | password    |  |
      | crazylife@gmail.com | C3r0P1n0Cho |  |


  @MyAccount2
  Scenario Outline: My Account Orders
    And Enter a registered username <username>
    And Enter a registered password <password>
    And Click on login button
    And User must successfully login to the web page
    And Click on MyAccount link
    And Click on Orders link
    Then User must view their orders
    Examples:
      | username            | password    |  |
      | crazylife@gmail.com | C3r0P1n0Cho |  |

  @MyAccount3
  Scenario Outline: My Account Orders, Customer and Billing details
    And Enter a registered username <username>
    And Enter a registered password <password>
    And Click on login button
    And User must successfully login to the web page
    And Click on MyAccount link
    And Click on Orders link
    And Click view button
    Then User must view his Orders, Customer and Billing details
    Examples:
      | username            | password    |  |
      | crazylife@gmail.com | C3r0P1n0Cho |  |