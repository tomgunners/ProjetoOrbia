package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryMap {

    public OrderHistoryMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Payment by check']")
    protected WebElement TitlePayByCheck;

}
