Feature:
  As a user i am interested to login to my account
  So that i can access my account related features & manage my orders as well

  Background:
    Given I am on the swagLab login page

  Scenario: Successful Login functionality check with valid user credentials
    Given I have entered a valid username and password
    When I click on the login CTA
    Then I should be logged-in to account successfully
