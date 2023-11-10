@Login @All
Feature: As a potential client i need to log me in on the website

  Background:
    Given The client is on testing page
    When The client taps on My Account menu

  @Login1
  Scenario Outline: Log-in with correct username and empty password
    And Enter case changed username <username>
    And Enter case changed password <password>
    And Click on login button
    Then Empty password error <mensaje>
    And prompt to enter login again
    Examples:
      | username            | password    | mensaje
      | Crazylife@gmail.com | c3r0P1n0Cho | Error: incorrect username/password.

  @Login2
  Scenario Outline: Log-in with correct username and empty password
    And Enter case changed username <username>
    And Enter case changed password <password>
    And Click on login button
    And sign out of the site
    And click back button
    And user shouldn’t be signed in to his account
    Then general webpage must be visible

    Examples:
      | username            | password    | mensaje
      | Crazylife@gmail.com | c3r0P1n0Cho | Error: incorrect username/password.