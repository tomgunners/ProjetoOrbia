package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutMap {

    public CheckoutMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    @FindBy(linkText = "Proceed to checkout")
    protected WebElement BtnProceedToCheckout;

    @FindBy(name = "processAddress")
    protected WebElement BtnAddressProceedToCheckout;

    @FindBy(name = "processCarrier")
    protected WebElement BtnShippingProceedToCheckout;

    @FindBy(id = "uniform-cgv")
    protected WebElement ChkTermsOfService;

    @FindBy(className = "cheque")
    protected WebElement BtnPayByCheck;

    @FindBy(xpath = "//button[@type='submit'][span= 'I confirm my order']")
    protected WebElement BtnConfirmMyOrder;

    @FindBy(xpath = "//*[@class='page-heading']")
    protected WebElement TitleOrderConfirmation;

    @FindBy(linkText = "Back to orders")
    protected WebElement BtnBackToOrders;

}
