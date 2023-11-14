@Registration @All
Feature: Register

  Background:
    Given The client is on testing page
    When The client taps on My Account menu


  @Registration1
  Scenario Outline: Registration with empty password
    And The client enters a valid email <email>
    And The client enters an empty password <password>
    And The client clicks on Register button
    Then Registration fails
    Examples:
      | email               | password |
      | crazylife@gmail.com |          |

  @Registration2
  Scenario Outline: Registration with Empty Email and password
    And The client enters an empty email <email>
    And The client enters an empty password <password>
    And The client clicks on Register button
    And Registration fails email
    Then Empty password error <mensaje>
    Examples:
      | email | password | mensaje
      |       |          | please provide valid email address