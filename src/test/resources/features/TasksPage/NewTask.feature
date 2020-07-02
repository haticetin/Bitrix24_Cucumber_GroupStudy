@wip
Feature: Tasks Page activity

  Scenario: As a user should be able to do create new task
    Given the user logged in as a "hr"
    And the user navigate to "Tasks" page and verify on the "My tasks" page
    When the user create a new task following credentials: Adem Talha Test Meeting, description, 17, November, 2020
    Then verify the task on the page with has following credentials: "Adem Talha Test Meeting" "November 17,  7:00 pm"