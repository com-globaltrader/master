package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccessApplication {

    public AccessApplication(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="username")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(id="submit")
    public WebElement ClickButton;
    @FindBy(xpath = "//a[@class=\"btn btn-lg btn-primary\"]")
    public WebElement LoginButton;
}
