$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US10_AccessApplication.feature");
formatter.feature({
  "name": "Access",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US10"
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
formatter.step({
  "name": "user navigate to vendor registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.RegisterAsAnAgent.user_navigate_to_vendor_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Company seller access to  to application with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US10"
    },
    {
      "name": "@US10_TCO1"
    }
  ]
});
formatter.step({
  "name": "user click on register page to Login here",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US10_AccessApplication.user_click_on_register_page_to_Login_here()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid email \"bayramhizal2071@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US10_AccessApplication.user_provide_valid_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"sdet.41\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US10_AccessApplication.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10_AccessApplication.user_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user access on application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US10_AccessApplication.user_access_on_application()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: should not be same expected not same\n\tat org.junit.Assert.fail(Assert.java:89)\n\tat org.junit.Assert.failSame(Assert.java:820)\n\tat org.junit.Assert.assertNotSame(Assert.java:799)\n\tat stepdefinitions.US10_AccessApplication.user_access_on_application(US10_AccessApplication.java:45)\n\tat ✽.user access on application(file:///Users/bayram/IdeaProjects/master/src/test/resources/features/US10_AccessApplication.feature:16)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
});