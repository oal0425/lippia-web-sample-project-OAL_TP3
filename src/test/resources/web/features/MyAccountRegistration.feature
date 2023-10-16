@Registration @All
Feature: Register

  Background:
    Given The client is on testing page
    When The client taps on My Account menu

  @Registration1
  Scenario Outline: Registration Sign-in
    And The client enters an email <email>
    And The client enters is own password <password>
    And The client clicks on Register button
    Then The client will be registered successfully
    Examples:
      | email               | password    |
      | crazylife@gmail.com | C3r0P1n0Cho |

  @Registration2
  Scenario Outline: Registration with Invalid Email-id
    And The client enters an invalid email <email>
    And The client enters is own password <password>
    And The client clicks on Register button
    Then Registration fails
    Examples:
      |email			| password			|
      |patata@11		|C3r0P1n0Cho		|

  @Registration3
  Scenario Outline: Registration with Empty Emailn
    And The client enters an empty email <email>
    And The client enters is own password <password>
    And The client clicks on Register button
    Then Registration fails
    Examples:
      |email			| password			|
      |				|C3r0P1n0Cho		|