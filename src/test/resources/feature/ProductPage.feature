Feature:
  As a user i am interested for adding products to my cart for checkout

  Background:
    Given I am on the swagLab login page

  Scenario: Successfully able to add products to cart for checkout
    Given I have entered a valid username and password
    When I click on the login CTA
    And I should be logged-in to account sucessfully
    And I should be able to add prodcuts to cart for checkout
    Then I should land on the cart page with the products added
