Feature: Base PartyUserStories

  Scenario: Individual Party Creation
    Given Enter the username and password
    When I create a individual Party
    Then the party should be created


    Scenario: Party MRU and party 360 Involvement validation
    Given It visible under recently accessed section
    When I click Organization Party
    Then the party details should be displayed with party 360 Involvement details