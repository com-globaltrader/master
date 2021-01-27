package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;


import pages.VendorRegisterFormAgentPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterAsAnAgent {

    VendorRegisterFormAgentPage agetRegistration = new VendorRegisterFormAgentPage();
    @Given("user is on GLBTreader home page")
    public void user_is_on_GLBTreader_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtrdr_url"));
    }

    @Given("user navigate to vendor registration page")
    public void user_navigate_to_vendor_registration_page() {
       agetRegistration.sellerJoinLink.click();
       Driver.wait(3);
      //  Assert.assertEquals("Vendor Register",Driver.getDriver().getTitle(),);
    }

    @Given("user select Agent seller form")
    public void user_select_Agent_seller_form() {
        agetRegistration.agentSellerRadioButton.click();
        assertTrue(agetRegistration.agentSellerRadioButton.isSelected());
    }

    @Given("user provide full name {string}")
    public void user_provide_full_name(String name) {
        agetRegistration.nameTextBox.sendKeys(name);

    }

    @Given("if name box is blank verify box will be red")
    public void if_name_box_is_blank_verify_box_will_be_red() {
      agetRegistration.nameTextBox.clear();
      agetRegistration.registrationButton.click();
      Driver.verifyElementDisplayed(agetRegistration.becomeRedBox);
      assertTrue(agetRegistration.becomeRedBox.isDisplayed());
    }

    @Given("user provide valid e mail {string}")
    public void user_provide_valid_e_mail(String email) {
        agetRegistration.emailTextBox.sendKeys(email);
    }

    @Given("if email box is blank verify box will be red")
    public void if_email_box_is_blank_verify_box_will_be_red() {
        agetRegistration.emailTextBox.clear();
        agetRegistration.registrationButton.click();
        assertTrue(agetRegistration.becomeRedBox.isDisplayed());

    }

    @Given("user provide invalid email {string}")
    public void user_provide_invalid_email(String invalidEmail) {
        agetRegistration.emailTextBox.clear();
        agetRegistration.emailTextBox.sendKeys(invalidEmail);
        agetRegistration.registrationButton.click();

    }

    @Then("verify error message {string}")
    public void verify_error_message(String emailError) {
      assertEquals(ConfigurationReader.getProperty("email_error_message"),agetRegistration.emailErrorText.getText());
    }

    @Given("user provide valid subdomain {string}")
    public void user_provide_valid_subdomain(String subdomain) {
      agetRegistration.subDomainTextBox.sendKeys(subdomain);
    }

    @Given("if subdomain box is blank verify box will be red")
    public void if_subdomain_box_is_blank_verify_box_will_be_red() {
      agetRegistration.subDomainTextBox.clear();
      agetRegistration.registrationButton.click();
      assertTrue(agetRegistration.becomeRedBox.isDisplayed());
    }

    @Given("user provide invalid sub domain {string}")
    public void user_provide_invalid_sub_domain(String invalidSubdomain) {
        agetRegistration.subDomainTextBox.sendKeys(invalidSubdomain);
        assertFalse(agetRegistration.becomeRedBox.isDisplayed());
    }

    @Then("verify regsitration can not be succesfull")
    public void verify_regsitration_can_not_be_succesfull() {
      //assertTrue();

    }

    @Given("user provide valid phone number {string}")
    public void user_provide_valid_phone_number(String mobile) {
        agetRegistration.mobileNumberTextBox.sendKeys(mobile);
    }

    @Given("user provide invalid phone number {string}")
    public void user_provide_invalid_phone_number(String invalidMobile) {
        agetRegistration.mobileNumberTextBox.clear();
        agetRegistration.mobileNumberTextBox.sendKeys(invalidMobile);
        agetRegistration.registrationButton.click();
    }

    @Then("verify error message on phone box {string}")
    public void verify_error_message_on_phone_box(String mobileErrorMessage) {
        agetRegistration.mobileNumberTextBox.clear();
      //  agetRegistration.

    }

    @Given("user provide less then {int} digits")
    public void user_provide_less_then_digits(Integer int1) {

    }

    @Then("verify red message on phone box {string}")
    public void verify_red_message_on_phone_box(String string) {

    }

    @Given("user select country from dropdown")
    public void user_select_country_from_dropdown() {

    }

    @Given("user provide state {string}")
    public void user_provide_state(String string) {

    }

    @Given("if state box is blank verify box will be red")
    public void if_state_box_is_blank_verify_box_will_be_red() {

    }

    @Given("user provide city {string}")
    public void user_provide_city(String string) {

    }

    @Given("if city box is blank verify box will be red")
    public void if_city_box_is_blank_verify_box_will_be_red() {

    }

    @Given("user provide address {string}")
    public void user_provide_address(String string) {

    }

    @Given("if address box is blank verify box will be red")
    public void if_address_box_is_blank_verify_box_will_be_red() {

    }

    @Given("user provide posta code {string}")
    public void user_provide_posta_code(String string) {

    }

    @Given("user select category from dropdown")
    public void user_select_category_from_dropdown() {

    }

    @Given("if category box is blank verify box will be red")
    public void if_category_box_is_blank_verify_box_will_be_red() {

    }

    @Given("user provide password {string}")
    public void user_provide_password(String string) {

    }

    @Given("if password box is blank verify box will be red")
    public void if_password_box_is_blank_verify_box_will_be_red() {

    }

    @Given("user cliks registration button")
    public void user_cliks_registration_button() {

    }

    @Then("verify success message {string}")
    public void verify_success_message(String string) {

    }

}
