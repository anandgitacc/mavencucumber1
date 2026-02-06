Feature: Validating login functionality

@Reg
Scenario: validating login with invalid credentialsone
Given user is on the login pageone
When user providing username and passwordone
And user click the login buttonone

@Smoke
Scenario: validating login with valid credentialstwo
Given user is on the login pagetwo
When user providing username and passwordtwo
And user click the login buttontwo

@Smoke
Scenario: validating login with blank credentialsthree
Given user is on the login pagethree
When user providing username and passwordthree
And user click the login buttonthree

@Sanity
Scenario: validating login with combo credentialsfour
Given user is on the login pagefour
When user providing username and passwordfour
And user click the login buttonfour



