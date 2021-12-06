Feature: Login Feature

  Scenario Outline: Verify Actitime Valid Login
    Given User Open Browser
    And enters actitime URL
    When user enter <username>
    And user enters <password>
    And user clicks on login Button
    Then Home page should be Displayed

    Examples: 
      | username | password |
      | admin    | manager  |
