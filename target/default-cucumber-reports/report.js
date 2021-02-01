$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US11_ForgetPassword.feature");
formatter.feature({
  "name": "ForgetPassword",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US11"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on GLBTreader home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.RegisterAsAnAgent.user_is_on_GLBTreader_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "when seller forget the Password,seller can see  a new message about sending new password on their emails",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US11"
    },
    {
      "name": "@US11_TC01"
    }
  ]
});
formatter.step({
  "name": "User click on home page sellers‘s Sign in items",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_home_page_sellers_s_Sign_in_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on email box",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_email_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  provide the valid email \"bayramhizal2071@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_provide_the_valid_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  click on forget password button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_forget_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Email button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_Email_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide validate Email \"bayramhizal2071@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_provide_validate_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Forget Password button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_Forget_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see a message as\"Your new Password Send Successfully On Your Email\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US11.user_should_see_a_message_as_Your_new_Password_Send_Successfully_On_Your_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on GLBTreader home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.RegisterAsAnAgent.user_is_on_GLBTreader_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "when seller forget the Password,seller can see  a new message about sending new password on their valid emails",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US11"
    },
    {
      "name": "@US11_TC02"
    }
  ]
});
formatter.step({
  "name": "User click on home page sellers‘s Sign in items",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_home_page_sellers_s_Sign_in_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on email box",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_email_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  provide the valid email \"bayramhizal2071@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_provide_the_valid_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  click on forget password button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_forget_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Email button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_Email_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide INvalidate Email \"bayramhizal@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_provide_INvalidate_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Forget Password button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11.user_click_on_Forget_Password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not see a message as\"Your new Password Send Successfully On Your Email\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US11.user_should_not_see_a_message_as_Your_new_Password_Send_Successfully_On_Your_Email()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:87)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat org.junit.Assert.assertFalse(Assert.java:65)\n\tat org.junit.Assert.assertFalse(Assert.java:75)\n\tat stepdefinitions.US11.user_should_not_see_a_message_as_Your_new_Password_Send_Successfully_On_Your_Email(US11.java:64)\n\tat ✽.user should not see a message as\"Your new Password Send Successfully On Your Email\"(file:///Users/bayram/IdeaProjects/master/src/test/resources/features/US11_ForgetPassword.feature:24)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
});