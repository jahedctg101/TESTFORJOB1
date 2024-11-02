Feature: Verify openHRM Login functionality
  Scenario: openHRM Login functionality Test
    Given employee is in landing page
    And employee enter username and password
    #And employee enter valid password
    When employee click on login button
    Then Verify employee login successfully