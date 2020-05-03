   Feature: Test Facebook Smoke Scenario
   
   Scenario Outline: Test Login with valid credentials
   
   Given open firfox and start application
   
   When i enter valid "username" and valid "password"
   
   Then user should be able to login sucessfully.
   
   
   Examples:
   
     |username|password|
     |naveen1|password1|
     |naveen2|password2|