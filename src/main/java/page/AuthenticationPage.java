package page;

import map.AuthenticationMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AuthenticationPage extends AuthenticationMap {

    public void validaPaginaAutenticacao() {
        String MsgAuthentication = TitleAuthentication.getText();
        Assert.assertEquals("AUTHENTICATION", MsgAuthentication);
    }

    public WebElement getInputEmailCreate() {
        return TxtEmail;
    }

    public void cliqueNoBotaoLogarHome() {
        BtnCreateAnAccount.click();
    }
}
