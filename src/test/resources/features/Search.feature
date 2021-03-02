Feature: Search and place orders for vegetables

  @SmokeTest @All
  Scenario: Search for items and validate results
    Given User is on Greenkart Landing page
    When User searched for Cucumber vegetable
    Then "Cucumber" results are displayed

  @RegressionTest @All
  Scenario Outline: Search for items and move to checkout page
    Given User is on Greenkart Landing page
    When User searched for <Name> vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then Verify selected <Name> items are displayed in Checkout page

    Examples:
      |Name     |
      |Brinjal  |
      |Beetroot |


