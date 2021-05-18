package page;

import map.MyAccountMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage extends MyAccountMap {

    public void interageMenu(WebDriver driver) {

        Actions act = new Actions(driver);
        act.moveToElement(MnDresses)
                .moveToElement(MnEveningDresses)
                .click()
                .build()
                .perform();
    }
}
