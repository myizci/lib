Feature: As a user, I should be able see my borrowing books.


  @US8
  Scenario: Verify borrowing books table column names
    Given user on login page
    When user login as a "student"
    And user navigate to BorrowingBooks page
    Then user should see following links on BorrowingBooks page
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |