Feature: Survey Page
  As a user I want to do survey into Feed it back website


  @smoke
  @regression
  Scenario: As a user when I click on Not got a code? link I should be navigated to Search for venue page successfully
    Given I am on survey page
    When I click on Not got a code?
    Then I should be navigated to Search for venue page successfully

  @sanity
  @regression
  Scenario: As a User I should be enter a feedback code in a text field and validate message
    Given I am on survey page
    When When I enter a code "123-456-712" into a feedback code text field
    Then Next button should be highlighted and I should be able to click on next buttton
    And An invalid PIN was supplied message should appear When entered code is invalid

  Scenario: As a user I should click on ? button and pop up get displayed with instruction
    Given I am on survey page
    When I click on ? button
    Then I should see the pop up displayed with instruction find your code with example of receipt

  Scenario:As a user I should enter 9 alphanumeric characters
    Given I am on survey page
    When I enter 9 alphanumeric character
    Then Next button should be highlighted

  Scenario:As a user I should enter 12 alphanumeric characters
    Given I am on survey page
    When I enter 12 alphanumeric character
    Then Next button should be highlighted

  Scenario: As a user I should see hyphen appeared automatically after typing 3 6 or 9 alphanumeric characters
    Given I am on survey page
    When I enter 3 6 or 9 alphanumeric number
    Then hyphen should appear