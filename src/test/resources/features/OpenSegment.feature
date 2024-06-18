Feature: OpenSegment

  As a user, i am able to open a segment case

  @Test
  Scenario: User is able to open a segment case
    Given User logs into the application as "Customer Service Representative"
    When User opens new "Interaction" case create screen
    Then User provides below "Search for customer" information
      | Search by          | Dropdown | Customer Information |
      | Phone number       | Textbox  | +44 7453278126       |
      | Service account ID | Textbox  | 67524321             |
      | Email              | Textbox  | hyter@gmail.com      |
    And User "Search" the "customer" in "Search for customer" screen
    And User "Clear" the "entered parameters" in "Search for customer" screen
