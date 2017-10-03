Feature: Base PartyUserStories

  Scenario Outline: Individual Party Creation
    Given Enter the username and password
    When I create a individual Party named "<partyName>"
    Then the "<partyName>" should be created

    Examples: 
      | partyName     |
      | SamplePerson |

      
