 #userstory1
 @login
 Feature:  Users should be able to login

  @smoke @wip
  Scenario: Login as helpdesk
    Given the user is on the login page
    When the user enter the "helpdesk" information
    Then the user should be able to login

  Scenario: Login as hr
    Given the user is on the login page
    When the user enter the "hr" information
    Then the user should be able to login

  @wip @smoke
  Scenario: Login as marketing
    Given the user is on the login page
    When the user enter the "marketing" information
    Then the user should be able to login
