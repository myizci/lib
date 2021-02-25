Feature: user status feature


  Background:
    Given user on login page
    When user login as a "librarian"
    And user navigate to Users page

  @US10A
  Scenario: verify user status

    And user click Status dropDown
    Then user should see following links under Status
      | ACTIVE   |
      | INACTIVE |

  @US10B
  Scenario: user management table column names

    Then user should see following column names on Users page
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |