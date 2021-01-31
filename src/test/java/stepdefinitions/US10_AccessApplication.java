package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccessApplication;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US10_AccessApplication {

    AccessApplication accessApplication=new AccessApplication();
    WebDriver driver;
    @Given("user click on register page to Login here")
    public void user_click_on_register_page_to_Login_here() {
        accessApplication.LoginButton.click();
    }

    @Given("user navigate to login page")
    public void user_navigate_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtrdr_url"));
    }

    @Given("user provide valid email {string}")
    public void user_provide_valid_email(String string) {
      accessApplication.username.sendKeys(string);
    }

    @Given("user provide valid password {string}")
    public void user_provide_valid_password(String string) {
        accessApplication.password.sendKeys(string);
    }

    @Given("user click on Login Button")
    public void user_click_on_Login_Button() {
        accessApplication.ClickButton.click();

    }

    @Then("user access on application")
    public void user_access_on_application() {
       String expected="https://www.glbtrader.com/vendor_login/1.html";
       String actual="https://www.glbtrader.com/vendor_login/1.html";
       Assert.assertNotSame("should not be same",expected,actual);


    }



}
