Feature: As a student, I should be able to see tables with default info

  Background:user navigates to login page
@US6
  Scenario: Table column names

    Given user on login page
    When user login as a "student"
    Then user should see following links on homepage
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |