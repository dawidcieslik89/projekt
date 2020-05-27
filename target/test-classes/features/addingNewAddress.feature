Feature: Create new address after login

  @test1

  Scenario Outline: Create and delete user new address
    Given User is logged in to shop
    When User goes to YourAddressesPage and click CreateNewAddress
    And User fills <alias>,<company>,<vatNumber>,<address>,<postcode>,<city>,<phone> fields
    And User choose country and save changes
    Then User see "Address successfully added!"
    And User check <alias>,<company>,<vatNumber>,<address>,<postcode>,<city>,<phone> is correct
#    When User click delete address
#    Then User can see "Address successfully deleted!"


    Examples:
      | alias | company      | vatNumber | address   | postcode | city   | phone     |
      | Bobik | BobikFactory | 893279121 | szkolna 2 | 00-000   | London | 000000000 |