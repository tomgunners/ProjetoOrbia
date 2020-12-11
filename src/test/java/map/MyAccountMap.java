package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountMap {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    protected WebElement MnDresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    protected WebElement MnEveningDresses;
}
