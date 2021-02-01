package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ForgetPassword;

public class US11 {
    ForgetPassword forgetPassword=new ForgetPassword();
    WebDriver driver;
    @Given("User click on home page sellers‘s Sign in items")
    public void user_click_on_home_page_sellers_s_Sign_in_items() {
        forgetPassword.SignIn.click();
    }

    @Then("user click on email box")
    public void user_click_on_email_box() {
        forgetPassword.EnterMail.click();
    }

    @Then("user  provide the valid email {string}")
    public void user_provide_the_valid_email(String string) {
       forgetPassword.EnterMail.sendKeys(string);
    }

    @Then("user  click on forget password button")
    public void user_click_on_forget_password_button() {
     forgetPassword.ForgetClick.click();
    }

    @Then("user click on Email button")
    public void user_click_on_Email_button() {
     forgetPassword.Emailblack.click();

    }

    @Then("user provide validate Email {string}")
    public void user_provide_validate_Email(String string) {
       forgetPassword.Emailblack.sendKeys(string);
    }

    @Then("user click on Forget Password button")
    public void user_click_on_Forget_Password_button() {
       forgetPassword.ForgetButton.click();
    }

    @Then("user should see a message as\"Your new Password Send Successfully On Your Email\"")
    public void user_should_see_a_message_as_Your_new_Password_Send_Successfully_On_Your_Email() {
        Boolean message=forgetPassword.ExpectedMessage.isDisplayed();
        Assert.assertTrue(message);

    }

    @Then("user provide INvalidate Email {string}")
    public void user_provide_INvalidate_Email(String string) {
        forgetPassword.Emailblack.sendKeys(string);
    }

    @Then("user should not see a message as\"Your new Password Send Successfully On Your Email\"")
    public void user_should_not_see_a_message_as_Your_new_Password_Send_Successfully_On_Your_Email() {
      Boolean message2=forgetPassword.ExpectedMessage.isDisplayed();
      Assert.assertFalse(message2);
    }



}
