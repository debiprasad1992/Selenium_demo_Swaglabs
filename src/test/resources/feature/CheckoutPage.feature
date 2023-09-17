Feature:
  As a user should able to checkout the added prodcuts from my cart
  Background:
    Given I am on the swagLab login page

  Scenario: Successfully able to add products to cart for checkout
    Given I have entered a valid username and password
    When I click on the login CTA
    And I should be logged-in to account successfully
    And I should be able to add products to cart for checkout
    And I should land on the cart page with the products added
    Then I should able to place the order successfully