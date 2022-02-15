Feature: Check all the ways to add an element to cart

  Scenario: Add an element to cart pay bank
    Given user is on home page
    When user click on sign in
    And user is navigated to the Authentication page
    And user enters valid email address and password
    And user clicks on sign in button
    And user logged in with valid credentials
    And user click on home icon
    And user is navigated to the home page
    And user select element
    And user add element to cart
    And user clicks on Proceed to checkout
    And user is navigated to the shopping cart summary page
    And user clicks on Proceed to checkout
    And user is navigated to the addresses page
    And user clicks on Proceed to checkout
    And user is navigated to the shipping page
    And user choose a shipping option for the address
    And user is navigated to the payment page
    And user choose payment method pay bank
    And user is navigated to the order summary page
    And user clicks on I confirm my order
    Then the order on My Store is complete.
