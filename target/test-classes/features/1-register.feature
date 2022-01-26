Feature: Test Registration

  Scenario Outline: user register successfully with valid credentials
    Given user is in sign up page
    When user fill "<username>" and "<password>"
    And click on sign up button
    And register successfully
    Then close sign up page


    Examples:
      | username | password |
      | pokemon123kaaksldjlkvlkjsvk | pokemon |

