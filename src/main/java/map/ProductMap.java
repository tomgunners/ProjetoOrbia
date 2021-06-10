package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMap {

    public ProductMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    @FindBy(id = "group_1")
    protected WebElement selectCmbSize;

    @FindBy(id = "color_7")
    protected WebElement selectColorBeige;

    @FindBy(id = "color_24")
    protected WebElement selectColorPink;

    @FindBy(name = "Submit")
    protected WebElement btnAddToCard;

    @FindBy(id = "new_comment_tab_btn")
    protected WebElement btnReviews;

}
