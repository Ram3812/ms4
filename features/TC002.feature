@search
Feature: Check the search bar

  @TS1
  Scenario: Antibacterial Products
    Given user on "https://tide.com/en-us"
    When user searches for "Antibacterial"
    Then user navigates to result page validate the text