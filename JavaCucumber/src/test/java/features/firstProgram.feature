Feature: Application Login
@MobileTest
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and password "12345"
Then Home Page is displayed
And Cards are displayed

#Reusable
@RegressionTest
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "user@123"
Then Home Page is displayed
And Cards are displayed

@SmokeTest @RegressionTest
Scenario Outline: User Page default login

Given User is on NetBanking landing page
When User login into application with "<user>" and password "<password>"
Then Home Page is displayed
And Cards are displayed

Examples: 
 | user  | password |
 | test1 | test123  |
 | test 2| test@12 |
 
 @SmokeTest
 Scenario: User Page default Sign up
 Given User is on Practice landing page
 When User Signup into application
 | rahul |
 |shetty |
 |contact@gmail.com|
 |33333322211|
 Then Home Page is displayed
 And Cards are displayed