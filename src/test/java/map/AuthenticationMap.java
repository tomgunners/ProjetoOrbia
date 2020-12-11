package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationMap {

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    protected WebElement TitleAuthentication;

    @FindBy(id = "email_create")
    protected WebElement TxtEmail;

    @FindBy(id =  "SubmitCreate")
    protected WebElement BtnCreateAnAccount;
}
