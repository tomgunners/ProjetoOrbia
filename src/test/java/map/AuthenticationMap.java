package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationMap {

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    public WebElement TitleAuthentication;

    @FindBy(id = "email_create")
    public WebElement TxtEmail;

    @FindBy(id =  "SubmitCreate")
    public WebElement BtnCreateAnAccount;
}
