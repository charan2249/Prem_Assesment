#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: User Signup and Login
  I want to use this template for my feature file

  @tag1
  Scenario: Create an account
    Given I am on the registration page
    When I fill out the form with valid details
    And I submit the form
    #Then I should see a success message

  @tag2
 Scenario: Login with the created account
 	Given I am on the sign-in-page
  When I enter valid details
   #And I click on {string}
   Then I should be logged in successfully

  