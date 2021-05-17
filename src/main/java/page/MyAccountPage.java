package page;

import map.MyAccountMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends MyAccountMap {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void interageMenu(WebDriver driver) {

        Actions act = new Actions(driver);
        act.moveToElement(MnDresses)
                .moveToElement(MnEveningDresses)
                .click()
                .build()
                .perform();
    }
}
