Feature: Product

  Background: Common steps for every scenario
    Given Open the browser and enter the URL as "https://www.saucedemo.com/v1/index.html"
    When Enter the username as "standard_user"
    When Enter the password as "secret_sauce"
    When Click on Login button

  Scenario: Verify user is able to add the product in the cart
    When Click on Add to cart button
    When Click on Cart button
    Then Expected value is "DESCRIPTION"
    And Close the browser