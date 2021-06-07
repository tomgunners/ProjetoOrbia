package page;

import map.ProductMap;
import org.openqa.selenium.WebElement;

public class ProductPage extends ProductMap {

    public WebElement selectSize() {
        return selectCmbSize;
    }

    public WebElement selectColorBeige() {
        return selectColorBeige;
    }

    public WebElement selectColorPink() {
        return selectColorPink;
    }

    public WebElement btnAddToCard(){
        return btnAddToCard;
    }

    public WebElement btnReviews(){
        return btnReviews;
    }
}
