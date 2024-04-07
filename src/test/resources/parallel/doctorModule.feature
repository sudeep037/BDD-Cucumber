Feature: To test the entire doctor module 

Scenario: Add the prescription for the patient
Given user enters url as "http://106.51.87.42:9007/"
Given user enter email as "aunty@gmail.com"
And user enter the password as "12345678"
And user click on login button
Then "Doctor Dashboard" page should be displayed
When doctor clicks on prescription link
Then the title of the page should be "Prescription - Hospital Management System" 
When doctor clicks on add prescription button 
Then "Add Prescription" prescription pop-up should be displayed 
And select the date 
And select the time 
And select the patient as "salman"
And enter values into case history 
And enter values into medications 
And enter values into notes
And click on submit button
Then check whether patient name as "salman" is displayed
And click on logout button
Given user enter email as "salman@gmail.com"
And user enter the password as "1234"
And user click on login button
Then "Patient Dashboard" page should be displayed
When patient clicks on prescription link 
Then the title of the page should be "Prescription - Hospital Management System" 
Then fetch the appointment details of patient 
And check whether patient name as "salman" is displayed
And click on logout button

 
