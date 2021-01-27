package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorRegisterFormAgentPage {

    public VendorRegisterFormAgentPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.=' Seller Join Now']")
    public WebElement sellerJoinLink;

    @FindBy(xpath = "//input[@id='vender_type']")
    public WebElement agentSellerRadioButton;

    @FindBy(xpath = "//input[@id='vender_type1']")
    public WebElement companySellerRadioButton;

    @FindBy(xpath = "//input[@id='vender_name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='sub_domain']")
    public WebElement subDomainTextBox;

    @FindBy(xpath = "//input[@id='vender_mobile']")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//input[@id='select_state']")
    public WebElement stateTextBox;

    @FindBy(xpath = "//input[@id='select_city']")
    public WebElement cityTextBox;

    @FindBy(xpath = "//textarea[@id='vender_address']")
    public WebElement addressTextBox;

    @FindBy(xpath = "//input[@id='zip_code_input']")
    public WebElement postalCodeTextBox;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement categoriesDropDown;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[.=' Registration']")
    public WebElement registrationButton;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary']")
    public WebElement loginHereLink;

    @FindBy(id = "alert_email_address")
    public WebElement emailErrorText;

//if you have more then 1 red box need to provide index for xpath
    @FindBy(xpath = "//input[@style='border-color: red;']")
    public WebElement becomeRedBox;











}
