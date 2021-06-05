package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountMap {

    public MyAccountMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='page-heading']")
    protected WebElement lblMyAccount;
}
