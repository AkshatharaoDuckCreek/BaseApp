Feature: Base PartyUserStories
@Test
  Scenario: Individual Party Creation
    Given Enter the username and password
    When I create a individual Party
    Then the party should be created

@test
    Scenario: Party MRU and party 360 Involvement validation
    Given It visible under recently accessed section
    When I click Organization Party
    Then the party details should be displayed with party 360 Involvement details
    
    Scenario: Search Business Party
    Given the business party has been created
    When I search and select Organization Party  by name
    Then the details should be displayed