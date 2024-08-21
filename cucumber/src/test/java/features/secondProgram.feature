Feature: Application Login on the second feature for hooks concepts

#To set default steps to run that can be executed with the help of background keyword
Background:

When launch the browser from config variables
Then hit the url 

@RegressionTest @NetBanking
Scenario: Admin Login Page 

Given user is on the landing page 
When user login into the application with username "Kumar" and password "K123"
Then Home page has been displayed
And Cards are listed out 

#Reusable

@RegressionTest @Mobilebanking
Scenario: User Login Page

Given user is on the landing page
When user login into the application with username "Suresh" and password "s123"
Then Home page has been displayed
And Cards are listed out 

@RegressionTest @SmokeTest @Netbanking
Scenario Outline: User Login Page

Given user is on the landing page
When user login into the application with username "<username>" and password "<password>" combination
Then Home page has been displayed
And Cards are listed out 

Examples:
| username	| password	|
| credituser| c123			|
| debituser | d123			|
