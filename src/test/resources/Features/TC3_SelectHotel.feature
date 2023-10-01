
Feature: verifying OMRBranch select hotel Automation

  Scenario Outline: Enter all details  and verify navigate to book hotel upon accepting the alert
   Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should select the first hotel and save its name and price
    And user should accept the alert
    Then User should verify book hotel success message "Book Hotel"

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |

  Scenario Outline: Enter all details  and verify navigate to book hotel upon dismiss the alert
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should select the first hotel and save its name and price
    And User should dismiss the alert
    Then User should verify select hotel success message "Select Hotel"

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |
