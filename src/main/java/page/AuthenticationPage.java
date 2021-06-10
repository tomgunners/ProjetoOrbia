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
        return TxtEmailCreate;
    }

    public void cliqueNoBotaoLogarHome() {
        BtnCreateAnAccount.click();
    }

    public WebElement getInputEmail() {
        return TxtEmail;
    }

    public WebElement getInputPassWord() {
        return Txtpasswd;
    }

    public void BtnSubmitLogin() {
        BtnSubmitLogin.click();
    }
}
