@Login @All
Feature: As a potential client i need to log me in on the website

  Background:
    Given The client is on testing page
    When The client taps on My Account menu

  @Login1
  Scenario Outline: Log-in with valid username and password
    And Enter a registered username <username>
    And Enter a registered password <password>
    And Click on login button
    Then User must successfully login to the web page
    Examples:
      | username            | password    |
      | crazylife@gmail.com | C3r0P1n0Cho |


  @Login2
  Scenario Outline: Log-in with incorrect username and password
    And Enter incorrect username <username>
    And Enter incorrect password <password>
    And Click on login button
    Then Proper error must be displayed <menses>
    And prompt to enter login again
    Examples:
      | username            | password | menses
      | crazylufa@gmail.com | 1234     | Error: A user could not be found with this email address


  @Login3
  Scenario Outline: Log-in with correct username and empty password
    And Enter a registered username <username>
    And Enter empty password <password> #chequear
    And Click on login button
    Then Empty password error <menses>
    And prompt to enter login again
    Examples:
      | username            | password | menses
      | crazylife@gmail.com | ""       | Error: Password is required.