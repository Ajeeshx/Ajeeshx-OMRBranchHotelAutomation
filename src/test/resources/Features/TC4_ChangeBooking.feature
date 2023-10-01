Feature: Verify OMR Branch Change Booking Details

  Scenario Outline: Verify change booking Module by changing checkInDate for created order id
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should select the first hotel and save its name and price
    And user should accept the alert
    Then User should verify book hotel success message "Book Hotel"
    When User add the guest details click Myself radio button and Enter "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User add GST details "<EnterRegistrationNo.>","<EnterCompanyName>" and "<EnterCompanyAddress>"
    And User add the special request "<SpecialRequest>"
    And User Enter payment Details,proceed with card type"<cardType>"
      | SelectCard | CardNo           | CardName | Month | Year | Cvv |
      | Visa       | 5555555555552222 | Mani     | March | 2024 | 123 |
      | MasterCard | 5555555555554444 | Mani     | March | 2024 | 123 |
      | Amex       | 5555555555550000 | Mani     | March | 2024 | 123 |
      | Discover   | 5555555555556666 | Mani     | March | 2024 | 123 |
    Then User should verify success message after booking hotel "Booking is Confirmed" and save the orderid
    And User should verify same hotel name is booked
    When user navigate to my booking page
    Then User should verify the success message "Bookings" after navigate to booking page
    When User search the orderId with saved orderId
    Then User should verify the same orderId is present successfully
    And User should verify the same hotel name is present successfully
    And User should verify the same hotel price is present successfully
    When User edit the booking by changing the checkInDate "<checkInDate>"
    Then User should verify after editing the chrckindate success message "Booking Updated Successfully"

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | EnterRegistrationNo | EnterCompanmyName      | EnterCompanyAddress | SpecialRequest | cardType   | checkInDate |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Large Bed      | creditCard | 2023-09-22  |

  Scenario Outline: Verify change booking Module by changing checkInDate for  order id
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User should navigate to my booking page
    Then User should verify the success message "Bookings" after navigate to booking page
    When User should modify the first order id
    And User edit the booking by changing the checkInDate "<checkInDate>"
    Then User should verify after editing the chrckindate success message "Booking Updated Successfully"

    Examples: 
      | username             | password      | CheckIndate |
      | pradhipgmg@gmail.com | Pradheeban21@ | 2023-09-22  |

  Scenario Outline: Verify change booking Module by changing checkInDate for existing order id
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User should navigate to my booking page
    Then User should verify the success message "Bookings" after navigate to booking page
    When User should modify the existing order id
    And User edit the booking by changing the checkInDate "<checkInDate>"
    Then User should verify after editing the chrckindate success message "Booking Updated Successfully"

    Examples: 
      | username             | password      | CheckIndate |
      | pradhipgmg@gmail.com | Pradheeban21@ | 2023-09-22  |
