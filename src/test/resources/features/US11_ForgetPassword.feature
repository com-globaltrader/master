@US11
Feature: ForgetPassword
  Background:
    Given user is on GLBTreader home page
  @US11_TC01
  Scenario: when seller forget the Password,seller can see  a new message about sending new password on their emails
    Given User click on home page sellers‘s Sign in items
    Then user click on email box
    Then user  provide the valid email "bayramhizal2071@gmail.com"
    Then user  click on forget password button
    Then user click on Email button
    Then user provide validate Email "bayramhizal2071@gmail.com"
    Then user click on Forget Password button
    And  user should see a message as"Your new Password Send Successfully On Your Email"
  @US11_TC02
    Scenario:  when seller forget the Password,seller can see  a new message about sending new password on their valid emails
    Given User click on home page sellers‘s Sign in items
    Then user click on email box
    Then user  provide the valid email "bayramhizal2071@gmail.com"
    Then user  click on forget password button
    Then user click on Email button
    Then user provide INvalidate Email "bayramhizal@gmail.com"
    Then user click on Forget Password button
    And  user should not see a message as"Your new Password Send Successfully On Your Email"
