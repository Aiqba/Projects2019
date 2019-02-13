# new feature
# Tags: optional

Feature: A description

  Scenario Outline: Login with invalid credentials
    Given User has to be in log in page
    When Try log in by invalid "userName" and "<password>"
    Then Unable to log in

    Examples:
    | userName   |password|
    |abc@gmail.com|a123   |
    |ang@gmail.com|cd123  |

    Scenario: Login with invalid credentials
      Given User is in login page
      When Enter invalid email and password from Data Table
      | userName| password|
      | testdata@gmail.com| testdata|
      | testabc@gmail.com | testabc |

      Then Error message appear