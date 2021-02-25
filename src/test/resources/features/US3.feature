Feature: User can see all available modules

  Background:
    Given user on login page


  Scenario:user login as a student and verify the top menus
    And user login as a "student"
    Then user should see following links
      | Books           |
      | Borrowing Books |

  Scenario:user login as a librarian and verify top menus
    And user login as a "librarian"
    Then user should see following links
      | Dashboard |
      | Users     |
      | Books     |