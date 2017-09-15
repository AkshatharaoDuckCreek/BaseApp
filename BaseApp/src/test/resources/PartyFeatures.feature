

#Sample Feature Definition Template

Feature: Title of your feature
	I want to use this template for my feature file
 

Scenario Outline: Login to the Base application
Given Enter the username "<name>" and password "<pwd>"
When I click on login
Then I enter the homepage

Examples:
    |name|pwd|
    |admin|admin|
   
