package page;

import map.MyAccountMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends MyAccountMap {

    public void validaPaginaMyAccount() {
        String LblMyAccount = lblMyAccount.getText();
        Assert.assertEquals("MY ACCOUNT", LblMyAccount);
    }

    public WebElement getTitleDresses() {
        return titleDresses;
    }

    public WebElement getTitleEveningDresses() {
        return titleEveningDresses;
    }

}
