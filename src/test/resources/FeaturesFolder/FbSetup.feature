@setup @e2e
Feature: Facebook Setup Feature

 @smoke
  Scenario: User Validate Login Feature by valid Creditial
    Given user laucnh chrome browser
    And user enter url
    When user enter userName and passWord
      | empID | empName | empEmailId       |
      |   100 | raseem  | raseem@gmail.com |
      |   200 | Rifas   | Rifas@gmail.com  |
      |   300 | Abdul   | abdul@gmail.com  |
    And user click login button
    Then user verify result
    
    @system
    Scenario: User Validate Login Feature by valid Creditial
    Given user laucnh chrome browser
    And user enter url
    When user enter userName and passWord
      | empID | empName | empEmailId       |
      |   100 | raseem  | raseem@gmail.com |
      |   200 | Rifas   | Rifas@gmail.com  |
      |   300 | Abdul   | abdul@gmail.com  |
    And user click login button
    Then user verify result
