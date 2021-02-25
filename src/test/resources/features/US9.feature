Feature: user group category feature

  @US9
  Scenario: verify user categories (as a librarian)
    Given user on login page
    When user login as a "librarian"
    And user navigate to Users page
    And user click User Group dropdown
    Then user should see following links on Users page
      | ALL       |
      | Librarian |
      | Students  |