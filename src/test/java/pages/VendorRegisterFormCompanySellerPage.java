package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorRegisterFormCompanySellerPage {

    public VendorRegisterFormCompanySellerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Seller Join Now']")
    public WebElement sellerJoinNow;

    @FindBy(xpath = "//input[@id='vender_type1']")
    public WebElement companySellerRadioButton;

    @FindBy(xpath = "//input[@id='company_name']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@id='company_mobile']")
    public WebElement companyMobile;

    @FindBy(xpath = "//textarea[@id='company_address']")
    public WebElement companyAddress;

    @FindBy(xpath = "//input[@id='vender_name']")
    public WebElement companySellerName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement companySellerEmail;

    @FindBy(xpath = "//input[@id='sub_domain']")
    public WebElement companySellerSubDomain;

    @FindBy(xpath = "//input[@id='vender_mobile']")
    public WebElement companySellerMobileNumber;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement companySellerCountry;

    @FindBy(xpath = "//input[@id='select_state']")
    public WebElement companySellerState;

    @FindBy(xpath = "//input[@id='select_city']")
    public WebElement companySellerCity;

    @FindBy(xpath = "//textarea[@id='vender_address']")
    public WebElement companySellerAddress;

    @FindBy(xpath = "//input[@id='zip_code_input']")
    public WebElement companySellerPostalCode;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement companySellerCategories;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement companySellerPassword;

    @FindBy(xpath = "//button[.=' Registration']")
    public WebElement companySellerRegistration;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary']")
    public WebElement companySellerLoginHere;

}
