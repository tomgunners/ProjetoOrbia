package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryMap {

    public CategoryMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='product-image-container']")
    protected WebElement productPrintedDress;

}
