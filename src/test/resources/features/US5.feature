Feature:As a librarian I should be able to see  books records on users page

  Background:user(librarian) navigates to login page
    Given user on login page
    When user login as a "librarian"
    And user navigate to Books page

  Scenario:verify that the default record is 10

    Then user can see default book record value as 10

  @wip
  Scenario: show records for count options

    Then user can see the record options

      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
