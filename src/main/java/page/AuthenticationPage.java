package page;

import map.AuthenticationMap;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends AuthenticationMap {

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void validaPaginaAutenticacao() {
        String MsgAuthentication = TitleAuthentication.getText();
        Assert.assertEquals("AUTHENTICATION", MsgAuthentication);
    }

    public void digiteEmailValido() {
        TxtEmail.sendKeys("nani@uorak.com");
    }

    public void cliqueNoBotaoLogarHome() {
        BtnCreateAnAccount.click();
    }
}
