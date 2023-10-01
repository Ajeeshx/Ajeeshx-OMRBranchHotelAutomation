
Feature: verifying OMRBranch hotel login Automation

  Scenario Outline: verifying omrbranch login with valid credentials
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"

    Examples: 
      | username             | password      |
      | pradhipgmg@gmail.com | Pradheeban21@ |

  Scenario Outline: verifying login with valid credentials using EnterKey
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>" with EnterKey
    Then User should verify success message after login "Welcome Pradhee"

    Examples: 
      | username             | password      |
      | pradhipgmg@gmail.com | Pradheeban21@ |

  Scenario Outline: verifying login with invalid credentials using EnterKey
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify error message after login "Hello Invalid Login details or your password might be Incorrect"

    Examples: 
      | username             | password      |
      | pradhipgmg@gmail.com | Pradheeban222 |
