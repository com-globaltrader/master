@US10
  Feature: Access
    Background:

      Given user is on GLBTreader home page
      Given user navigate to vendor registration page


      @US10_TCO1

      Scenario:Company seller access to  to application with valid credentials
        Given user click on register page to Login here
        Given user provide valid email "bayramhizal2071@gmail.com"
        Given user provide valid password "sdet.41"
        And user click on Login Button
        Then user access on application