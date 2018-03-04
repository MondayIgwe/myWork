Feature: Google search

  Scenario: Validate google search text field
    Given I open the browser
    When I navigate to google page
    Then I validate the search text field

    
    
  Scenario: Validate gmail account
    Given I open the browser
    When I navigate to gmail page
    Then I validate gmail link
    