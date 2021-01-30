package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.VendorRegisterFormAgentPage;
import utilities.Driver;


public class US06_Negative_StepDefinitions {

    VendorRegisterFormAgentPage agentRegister = new VendorRegisterFormAgentPage();

    @Then("user sees red box around name text box")
    public void user_sees_red_box_around_name_text_box() {
        SoftAssert softAssert = new SoftAssert();
        //Driver.waitForVisibility(agentRegister.listOfRedBox.get(0),5);
        softAssert.assertTrue(agentRegister.listOfRedBox.get(0).isDisplayed());
        softAssert.assertAll();
    }

    @Then("user sees red box around email text box")
    public void user_sees_red_box_around_email_text_box() {
        SoftAssert softAssert = new SoftAssert();
        //Driver.waitForVisibility(agentRegister.listOfRedBox.get(1),5);
        softAssert.assertTrue(agentRegister.listOfRedBox.get(1).isDisplayed());
        softAssert.assertAll();
    }

    @Then("user sees red box around sub domain text box")
    public void user_sees_red_box_around_sub_domain_text_box() {
        SoftAssert softAssert = new SoftAssert();
        //Driver.waitForVisibility(agentRegister.listOfRedBox.get(2),5);
        softAssert.assertTrue(agentRegister.listOfRedBox.get(2).isDisplayed());
        softAssert.assertAll();
    }

    @Then("user sees red box around mobileNumber text box")
    public void user_sees_red_box_around_mobileNumber_text_box() {

        Assert.assertTrue(agentRegister.listOfRedBox.get(0).isDisplayed());

    }

    @Then("user sees red box around state text box")
    public void user_sees_red_box_around_state_text_box() {

        Assert.assertTrue(agentRegister.listOfRedBox.get(1).isDisplayed());

    }

    @Then("user sees red box around city text box")
    public void user_sees_red_box_around_city_text_box() {

        Assert.assertTrue(agentRegister.listOfRedBox.get(2).isDisplayed());
    }

    @Given("user provide valid sub domain {string}")
    public void user_provide_valid_sub_domain(String string) {
        agentRegister.subDomainTextBox.sendKeys(string);
    }

    @Then("user sees red box around address text box")
    public void user_sees_red_box_around_address_text_box() {
        Assert.assertTrue(agentRegister.addressRedBox.isDisplayed());
    }

    @Then("user sees red box around password text box")
    public void user_sees_red_box_around_password_text_box() {
        Assert.assertTrue(agentRegister.listOfRedBox.get(0).isDisplayed());
    }

    @Then("user sees red boxes around every mandatory text boxes")
    public void user_sees_red_boxes_around_every_mandatory_text_boxes() {

        SoftAssert softAssert = new SoftAssert();
        for(WebElement w : agentRegister.listOfRedBox){
            softAssert.assertTrue(w.isDisplayed());
        }
        softAssert.assertAll();

        Assert.assertEquals(agentRegister.listOfRedBox.size(),7);
        System.out.println(agentRegister.listOfRedBox.size());
    }

}
