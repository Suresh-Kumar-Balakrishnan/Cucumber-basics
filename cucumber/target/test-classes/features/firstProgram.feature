
Feature: Application Login

#To set default steps to run that can be executed with the help of background keyword
Background:

Given Setup the DB 
When launch the browser from config variables
Then hit the url 

@RegressionTest
Scenario: Admin Login Page 

Given user is on the landing page 
When user login into the application with username "Kumar" and password "K123"
Then Home page has been displayed
And Cards are listed out 

#Reusable

@RegressionTest
Scenario: User Login Page

Given user is on the landing page
When user login into the application with username "Suresh" and password "s123"
Then Home page has been displayed
And Cards are listed out 

@RegressionTest @SmokeTest
Scenario Outline: User Login Page

Given user is on the landing page
When user login into the application with username "<username>" and password "<password>" combination
Then Home page has been displayed
And Cards are listed out 

Examples:
| username	| password	|
| credituser| c123			|
| debituser | d123			|

@SmokeTest
Scenario Outline: Admin Login Page

Given user is on the landing page
When user login into the application with username <username> and password "password" regex pattern
Then Home page has been displayed
And Cards are listed out 

Examples:
| username	| password	|
| credituser| c123			|
| debituser | d123			|

@SmokeTest
Scenario Outline: Default sign up page 

Given user is on the signup page
When user signup into the application
| suresh |
| kumar  |
| Sk@gmail.com |
| 12345793797 |
Then Home page has been displayed
And Cards are listed out 


