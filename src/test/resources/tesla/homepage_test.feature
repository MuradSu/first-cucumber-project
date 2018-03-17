Feature: Tesla home page

  Scenario: Model S link
    Given I am on the home page
    When I click on Model S link
    Then Model S home page should be displayed

  Scenario: Roadster link
    Given I am on the home page
    When I click on Roadster link
    Then Roadster home page should be displayed
    #  if any step in the scenario fails, 
    # following steps will be ignored
    And I close browser
