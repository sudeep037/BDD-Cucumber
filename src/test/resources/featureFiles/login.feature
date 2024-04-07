Feature: To the login Functionality 

Background: common steps
Given when user enters url as "http://106.51.87.42:9007/"

Scenario: To test whether the doctor can login with the credentials 
When doctor enters the email as "aunty@gmail.com"
And doctor enters the password as "12345678"
And click on login button
Then " Doctor Dashboard " page should be displayed 


Scenario: To test whether the patient can login with the credentials 
When patient enters the email as "salman@gmail.com"
And patient enters the password as "1234"
And click on login button
Then "Patient Dashboard" page should be displayed

Scenario: To test whether the nurse can login with the credentials 
When patient enters the email as "tumpa@gmail.com"
And patient enters the password as "12345678"
And click on login button
Then "Nurse Dashboard" page should be displayed

Scenario: To test whether the pharmacist can login with the credentials 
When patient enters the email as "rahul@gmail.com"
And patient enters the password as "1234"
And click on login button
Then "Pharmacist Dashboard" page should be displayed

