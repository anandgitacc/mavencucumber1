Feature: Validating login functionality

Background: 
Given user is on the login page
And user verifying successful login

Scenario Outline: validating login with invalid credentials
When user providing "<username>" and "<password>"
And user click the login button


Examples:
|username|password|
|anand@gmail.com|anand@123|
|siva@gmail.com|siva@123|
|venkat@gmail.com|venkat@123|




