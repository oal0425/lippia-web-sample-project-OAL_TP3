@Registration @All
Feature: Register

  Background:
    Given The client is on testing page
    When The client taps on My Account menu


  @Registration1
  Scenario Outline: Registration with Empty Email
    And The client enters an empty email <email>
    And The client enters is own password <password>
    And The client clicks on Register button
    Then Registration fails
    Examples:
      |email			| password			|
      |				|C3r0P1n0Cho		|

  @Registration2
  Scenario Outline: Registration with Empty Email
    And The client enters an empty email <email>
    And The client enters an empty password <password>
    And The client clicks on Register button
    And Registration fails
    Then Empty password error <mensaje>
    Examples:
      | email | password | mensaje
      |       |          | please provide valid email address