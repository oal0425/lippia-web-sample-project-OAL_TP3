@Login @All
Feature: As a potential client i need to log me in on the website
  Background:
    Given The client is on testing page
    When The client taps on My Account menu
  @Login1
  Scenario Outline: LoginHandles case sensitive
    And Enter case changed username <username>
    And Enter case changed password <password>
    And Click on login button
    Then Login must fail saying <mensaje>
    Examples:
      | username            | password    | mensaje
      | Crazylife@gmail.com | c3r0P1n0Cho | Error: incorrect username/password.
      | CRAZYLIFE@gmail.com | C3R0P1N0CHO | Error: incorrect username/password.
  @Login2
  Scenario Outline: LoginAuthentication
    And Enter case changed username <username>
    And Enter case changed password <password>
    And Click on login button
    And Click on Logout button
    And click back button
    Then general webpage must be visible
    Examples:
      | username            | password    | mensaje |
      | crazylife@gmail.com | C3r0P1n0Cho | Success |