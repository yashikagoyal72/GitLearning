
Feature: Application Login

Background:
Given setup the entries in database
When launch the browser from config variable
And hit the home page url of banking site
  
 @RegressionTest
Scenario: Admin Page default login

Given User is on Netbanking landing page
When User login into application with "Admin" and password "1234"
Then Home page is displayed

@RegressionTest
Scenario: User Page default login

Given User is on Netbanking landing page
When User login into application with "user" and password "9252"
Then Home page is displayed

@SmokeTest
Scenario Outline:  User Page default login

Given User is on Netbanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home page is displayed

Examples: 
 | Username | Password |
 | debituser | 1234 |
 | stock | 123456 |
 
 @SmokeTest @RegressionTest
 Scenario: User Page default sign up 
 
 Given User is on Practice landing page
 When User sign up into application
 | yashika | 
 | Goyal |
 | yashikagoyal@gmail.com |
 | 123456789 |
 Then Home page is displayed
 
 

