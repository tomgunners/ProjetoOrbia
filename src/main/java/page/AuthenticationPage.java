package page;

import map.AuthenticationMap;
import org.junit.Assert;

public class AuthenticationPage extends AuthenticationMap {

    public void validaPaginaAutenticacao() {
        String MsgAuthentication = TitleAuthentication.getText();
        Assert.assertEquals("AUTHENTICATION", MsgAuthentication);
    }

    public void digiteEmailValido() {
        TxtEmail.sendKeys("welzao@uorak.com");
    }

    public void cliqueNoBotaoLogarHome() {
        BtnCreateAnAccount.click();
    }
}
