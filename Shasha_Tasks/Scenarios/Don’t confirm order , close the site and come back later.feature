Feature: Check all negative to add element to the cart

  Scenario: Don’t confirm order , close the site and come back later
    Given user is on home page
    When user click on sign in
    And user is navigated to the Authentication page
    And user enters valid email address and password
    And user clicks on sign in button
    And user logged in with valid credentials
    And user click on home icon
    And user is navigated to the home page
    And user click on t-shirts tab
    And user is navigated to the t-shirts tab page
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
    And user does not click on I confirm my order
    And user close the site and come back later
    Then the element to still in cart
