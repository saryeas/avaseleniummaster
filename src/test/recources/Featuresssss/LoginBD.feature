Feature: Login




@BD1S
Scenario: Verify user can login
Given Open Application "<URL>"
Then Click on Signinbutton
Then Click signinLink
Then Enter user pass and Click signin
Then Verify user can login
