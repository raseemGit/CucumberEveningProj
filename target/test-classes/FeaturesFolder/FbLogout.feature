@logout @e2e
Feature: Facebook LogOut Feature

  @sanity
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
