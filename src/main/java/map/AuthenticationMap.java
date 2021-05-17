package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationMap {

    public AuthenticationMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    protected WebElement TitleAuthentication;

    @FindBy(id = "email_create")
    protected WebElement TxtEmail;

    @FindBy(id = "SubmitCreate")
    protected WebElement BtnCreateAnAccount;
}
