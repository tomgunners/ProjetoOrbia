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

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]")
    protected WebElement titleDresses;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")
    protected WebElement titleEveningDresses;
}
