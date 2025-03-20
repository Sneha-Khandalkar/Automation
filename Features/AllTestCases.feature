Feature: TestCompleteApplication

@RegisterUser
Scenario: Verify user registration page

Given Launch browser
When Navigate to url "https://www.automationexercise.com/"
Then Verify that home page is visible successfully
When Click on Signup or Login button
Then Verify 'New User Signup!' is visible
And Enter name and email address
When Click Signup button
Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
And Fill details: Title, Name, Email, Password, Date of birth
And Select checkbox Sign up for our newsletter!
And Select checkbox Receive special offers from our partners!
And Fill details: First name, Last name, Company, Address, Country, State, City, Zipcode, Mobile Number
When Click Create Account button
Then Verify that account created 'ACCOUNT CREATED!' is visible
When Click Continue button
Then Verify that username 'Logged in as Sneha' is visible
When Click Delete Account button
Then Verify that account deleted 'ACCOUNT DELETED!' is visible 
And click Continue button
And close the browser