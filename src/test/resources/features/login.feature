Feature: Test Login

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    When user is navigated to the home page
    Then click on logout button

    Examples:
      | Username | Password |
      | pokemon123kaaksldjlkvlkjsvk   | pokemon   |