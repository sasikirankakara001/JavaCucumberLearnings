Feature: Application Login
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and password "12345"
Then Home Page is displayed
And Cards are displayed

#Reusable

Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "user@123"
Then Home Page is displayed
And Cards are displayed

Scenario Outline: User Page default login

Given User is on NetBanking landing page
When User login into application with "<user>" and password "<password>"
Then Home Page is displayed
And Cards are displayed

Examples: 
 | user  | password |
 | test1 | test123  |
 | test 2| test@12 |