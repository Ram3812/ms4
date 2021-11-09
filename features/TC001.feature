@shopproducts
Feature: Shop Products 

  @TS1
  Scenario: Verify if the Tide Free and Gentle powder.
    Given user on "https://tide.com/en-us"
    When Hover on shop products
    And click on powder
    Then navigates to products page
    And verify the product present