Feature: test

  Scenario: add new user
    When i click on add User button
    And the form is diplayed
    And i fill out the form
    And press the save button
    Then the new user is added to the table

  Scenario: don't remove novak user to validate exception
    When novak user is present on the table
    Then novak user is no longer present on the table

  Scenario: remove novak user
    When novak user is present on the table
    And i click on the delete button
    And i press ok in the confirmation dialog
    Then novak user is no longer present on the table