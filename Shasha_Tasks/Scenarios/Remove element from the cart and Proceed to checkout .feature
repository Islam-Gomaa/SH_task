Feature: Check all negative to add element to the cart

  Scenario: Remove element from the cart and Proceed to checkout
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
    And user remove element from the cart
    Then element Removeed from the cart
