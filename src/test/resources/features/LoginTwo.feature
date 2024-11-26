
Feature: Facebook login functionality
  Scenario Outline: log in using user invalid credential
    Given the user is in login page
    When enter "<username>" and "<password>"
    Then enter "Log in" button
    Then user should see the invalid user name or password alert

    Examples:
    | username  | password  |
    |asdasd|asd889|

