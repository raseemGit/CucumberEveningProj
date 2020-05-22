@login @e2e
Feature: Facebook Login Feature

  Background: 
    Given user laucnh chrome browser
    And user enter url

  @sanity
  Scenario: User Validate Login Feature by valid Creditial
    When user enter userName and passWord
      | empID | empName   | empEmailId          |
      |   100 | Vel       | Vel@gmail.com       |
      |   200 | Saranya   | Saranya@gmail.com   |
      |   300 | Nishanthi | Nishanthi@gmail.com |
    And user click login button
    Then user verify result

  @functional
  Scenario: User Validate Login Feature by valid Creditial
    When user enter userName and passWord
      | empID | empName   | empEmailId          |
      |   100 | Vel       | Vel@gmail.com       |
      |   200 | Saranya   | Saranya@gmail.com   |
      |   300 | Nishanthi | Nishanthi@gmail.com |
    And user click login button
    Then user verify result scenario two
