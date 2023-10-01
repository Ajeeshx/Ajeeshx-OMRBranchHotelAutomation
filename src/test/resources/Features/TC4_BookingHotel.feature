Feature: Verify OMR Branch Book Hotel Details

  Scenario Outline: Book hotel including GST-card-debitcard-VISA-with special request
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

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | EnterRegistrationNo | EnterCompanmyName      | EnterCompanyAddress | special Request | cardType  |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Large Bed       | DebitCard |

   Scenario Outline: Book hotel including GST-card-CreditCard-VISA-with special request
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
      | Visa       | 5555555555552223 | Mani     | March | 2024 | 123 |
      | MasterCard | 5555555555554444 | Mani     | March | 2024 | 123 |
      | Amex       | 5555555555550000 | Mani     | March | 2024 | 123 |
      | Discover   | 5555555555556666 | Mani     | March | 2024 | 123 |
    Then User should verify success message after booking hotel "Booking is Confirmed" and save the orderid
    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | EnterRegistrationNo | EnterCompanmyName      | EnterCompanyAddress | SpecialRequest | cardType   |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Large Bed      | creditCard |

  Scenario Outline: Book hotel including GST-card-debitcard-VISA-without special request
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
    And User click next without add special request
    And User Enter payment Details,proceed with card type"<cardType>"
      | SelectCard | CardNo           | CardName | Month | Year | Cvv |
      | Visa       | 5555555555552222 | Mani     | March | 2024 | 123 |
      | MasterCard | 5555555555554444 | Mani     | March | 2024 | 123 |
      | Amex       | 5555555555550000 | Mani     | March | 2024 | 123 |
      | Discover   | 5555555555556666 | Mani     | March | 2024 | 123 |
    Then User should verify success message after booking hotel "Booking is Confirmed" and save the orderid

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | EnterRegistrationNo | EnterCompanmyName      | EnterCompanyAddress | cardType  |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | DebitCard |

  Scenario Outline: Book hotel including GST-card-CreditCard-VISA-without special request
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
    And User click next without add special request
     And User Enter payment Details,proceed with card type"<cardType>"
      | SelectCard | CardNo           | CardName | Month | Year | Cvv |
      | Visa       | 5555555555552223 | Mani     | March | 2024 | 123 |
      | MasterCard | 5555555555554444 | Mani     | March | 2024 | 123 |
      | Amex       | 5555555555550000 | Mani     | March | 2024 | 123 |
      | Discover   | 5555555555556666 | Mani     | March | 2024 | 123 |
    Then User should verify success message after booking hotel "Booking is Confirmed" and save the orderid

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | EnterRegistrationNo | EnterCompanmyName      | EnterCompanyAddress | cardType   |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | creditCard |

  Scenario Outline: Book hotel without GST-card-debitcard-VISA-with special request
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should select the first hotel and save its name and price
    And user should accept the alert
    Then User should verify book hotel success message "Book Hotel"

    When User add the guest details click Myself radio button and Enter "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User add the special request "<SpecialRequest>"
    And User Enter payment Details,proceed with card type"<cardType>"
      | SelectCard | CardNo           | CardName | Month | Year | Cvv |
      | Visa       | 5555555555552222 | Mani     | March | 2024 | 123 |
      | MasterCard | 5555555555554444 | Mani     | March | 2024 | 123 |
      | Amex       | 5555555555550000 | Mani     | March | 2024 | 123 |
      | Discover   | 5555555555556666 | Mani     | March | 2024 | 123 |
    Then User should verify success message after booking hotel "Booking is Confirmed" and save the orderid


    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | cardType  | specialRequest |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com | DebitCard | LargeBed       |

   Scenario Outline: Book hotel without GST-card-CreditCard-VISA-without special request
    Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should select the first hotel and save its name and price
    And user should accept the alert
    Then User should verify book hotel success message "Book Hotel"

    When User add the guest details click Myself radio button and Enter "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User click next without add special request
    And User Enter payment Details,proceed with card type"<cardType>"
      | SelectCard | CardNo           | CardName | Month | Year | Cvv |
      | Visa       | 5555555555552223 | Mani     | March | 2024 | 123 |
      | MasterCard | 5555555555554444 | Mani     | March | 2024 | 123 |
      | Amex       | 5555555555550000 | Mani     | March | 2024 | 123 |
      | Discover   | 5555555555556666 | Mani     | March | 2024 | 123 |
    Then User should verify success message after booking hotel "Booking is Confirmed" and save the orderid

    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | cardType   |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com | creditCard |

   Scenario Outline: Without entering any field book hotel and verify error message
     Given User is on the omrbranch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Pradhee"
    When User search hotel "<selectstate>","<selectcity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<no.ofRoom>","<no.ofAdult>" and "<no.ofChildren>"
    Then User should verify search hotels after success message "Select Hotel"
    When User should select the first hotel and save its name and price
    And user should accept the alert
    Then User should verify book hotel success message "Book Hotel"

    When User add the guest details click Myself radio button and Enter "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User click next without add special request
    And User click submit without enter any field
    Then User should verify all error message "Please select your card type","Please select your card type","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"
    Examples: 
      | username             | password      | selectstate | selectcity | selectRoomType | checkInDate | checkOutDate | no.ofRoom | no.ofAdult | no.ofChildren | SelectSalutation | Firstname | Lastname | Mobilenumber | Email             | EnterRegistrationNo | EnterCompanmyName      | EnterCompanyAddress | SpecialRequest |
      | pradhipgmg@gmail.com | Pradheeban21@ | TamilNadu   | Chennai    | Standard       | 2023-09-21  | 2023-09-30   | 1-One     | 1-One      |             1 | Mr.              | Pradhee   | ban      |   8344171395 | pradhip@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | LargeBed       |
