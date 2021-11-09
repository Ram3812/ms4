@LearnMore
Feature: Verify the learn more

  @TS1
  Scenario: Verify the learn more in how to do laundry
    Given user on "https://tide.com/en-us"
    When user click on learn more
    Then navigates to next page verify the text