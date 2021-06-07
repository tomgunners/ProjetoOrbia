package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationMap {

    public AuthenticationMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    // CREATE AN ACCOUNT

    @FindBy(xpath = "//*[@id='center_column']/h1")
    protected WebElement TitleAuthentication;

    @FindBy(id = "email_create")
    protected WebElement TxtEmailCreate;

    @FindBy(id = "SubmitCreate")
    protected WebElement BtnCreateAnAccount;

    //ALREADY REGISTERED?
    @FindBy(id = "email")
    protected WebElement TxtEmail;

    @FindBy(id = "passwd")
    protected WebElement Txtpasswd;

    @FindBy(id = "SubmitLogin")
    protected WebElement BtnSubmitLogin;
}
