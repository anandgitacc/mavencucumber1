Feature: Validating login functionality

Scenario: validating login with invalid credentials
Given user is on the login page
When user providing username and password
And user click the login button
Then user checking with unsuccessful login message or error message



