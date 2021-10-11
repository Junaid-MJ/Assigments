  Feature: BDD+RestAssured
  
    Scenario: Negative Scenario
    Given API for foreign exchange
    When create negative scenario
    Then print the response into console
    
    
    Scenario: Negative Assertion
    Given API for foreign exchange
    When create  negative assertion scenario
    Then print the negative response in console
    
    
    Scenario: Future Time Scenario
    Given API for foreign exchange
    When To get Time & Date
    Then print the response in console