package page;

import map.MyAccountMap;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage extends MyAccountMap {

    public void validaPaginaMyAccount() {
        String LblMyAccount = lblMyAccount.getText();
        Assert.assertEquals("MY ACCOUNT", LblMyAccount);
    }

}
