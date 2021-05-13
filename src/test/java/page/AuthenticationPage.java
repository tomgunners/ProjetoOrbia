package page;

import hook.Hooks;
import map.AuthenticationMap;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends AuthenticationMap{

    public AuthenticationPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void validaPaginaAutenticacao() throws Exception {
        String MsgAuthentication = TitleAuthentication.getText();
        Assert.assertEquals("AUTHENTICATION", MsgAuthentication);
    }

    public void digiteEmailValido(){

        TxtEmail.sendKeys("nani@uorak.com");
    }

    public void cliqueNoBotaoLogarHome() {
        BtnCreateAnAccount.click();
    }
}
