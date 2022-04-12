Feature: Validation of FaceBook
Scenario: Validation of FaceBook with correct username and correct password
Given user must launch the facebook url
When user enters the correct username and correct password
And user clicks on the login button
Then user Validates url is navigated to Home Page
