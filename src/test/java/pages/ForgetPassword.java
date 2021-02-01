package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ForgetPassword {
   public ForgetPassword(){


       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath = "//a[@href='https://www.glbtrader.com/vendor.php']")
    public WebElement SignIn;
   @FindBy(id = "username")
    public WebElement EnterMail;
   @FindBy(xpath = "//a[@href='https://www.glbtrader.com/vendor_forgot.html']")
    public WebElement ForgetClick;
   @FindBy(id="forgot_email")
    public WebElement Emailblack;
   @FindBy(id="submit")
    public WebElement ForgetButton;
   @FindBy(xpath = "//div[@class='error_message']")
    public WebElement ExpectedMessage;



}
