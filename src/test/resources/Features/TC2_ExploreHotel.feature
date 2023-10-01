
Feature: verifying OMRBranch search hotel Automation

  Scenario Outline: Enter all Details and Verifying Select Hotel
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |

  Scenario Outline: Enter Only Mandatory fields and verify select hotel
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<checkInDate>","<checkOutDate>","<no.ofRoom>" and "<no.ofAdult>"
    Then User should verify search hotels after success message "Select Hotel"

    Examples: 
      | username             | password      | selectstate | selectcity | checkInDate | checkOutDate | no.ofRoom | no.ofAdult |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |

  Scenario Outline: Enter all Details and Verify Hotel Name Ends With Deluxe
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
   Then User should verify search hotels after success message "Select Hotel"
    And User should verify each hotel name ends with the "<selectRoomType>"

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Deluxe         | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |

  Scenario Outline: Without enter any field click search and verify all error message
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User should click search hotel without enter mandatory field
    Then User Should verify the error messages "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms","Please select no. of adults"

    Examples: 
      | username             | password      |
      | pradhipgmg@gmail.com | Pradheeban21@ |

  Scenario Outline: Enter all field and verify filter room type
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
   Then User should verify search hotels after success message "Select Hotel"
    And User should verify same selected room type is header "<selectRoomType>"

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType                      | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard/Deluxe/Suite/Luxury/Studio | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |

  Scenario Outline: Enter all Details and Verify Hotel price listed in the low to high
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should click price low to high radio button
    Then User should verify the hotel price is listed in low to high

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |

  Scenario Outline: Enter all Details and Verify Hotel name displayed in Descending order
   Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should click name descending order radio button
    Then User should verify the hotel name is listed in descending order

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 |
