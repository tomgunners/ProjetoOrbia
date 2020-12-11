package page;

import hook.Hooks;
import map.MyAccountMap;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends MyAccountMap {

    public MyAccountPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void interageMenu() {

        Actions act = new Actions(Hooks.getDriver());
        act.moveToElement(MnDresses)
        .moveToElement(MnEveningDresses)
        .click()
        .build()
        .perform();
    }
}
