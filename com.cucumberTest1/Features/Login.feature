Feature: Login

  Background: Common steps for every scenario
    Given Open the browser and enter the URL as "https://www.saucedemo.com/v1/index.html"
    When Enter the username as "standard_user"
    When Enter the password as "secret_sauce"
    When Click on Login button
    
    
Scenario: Verify user is able to login with valid credentials


Then Expected value is "Products"
And Close the browser



Scenario: Verify user is able to login with Invalid credentials


Then Expected title is "Swag Labs"
And Close the browser

Scenario: Verify user is able to login with Invalid credentials


Then Expected title is "Swag Labs"
And Close the browser