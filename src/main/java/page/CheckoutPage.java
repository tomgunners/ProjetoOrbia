package page;

import map.CheckoutMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends CheckoutMap {

    public WebElement btnProceedToCheckout() {
        return BtnProceedToCheckout;
    }

    public WebElement btnAddressProceedToCheckout() {
        return BtnAddressProceedToCheckout;
    }

    public WebElement btnShippingProceedToCheckout() {
        return BtnShippingProceedToCheckout;
    }

    public WebElement chkTermsOfService() {
        return ChkTermsOfService;
    }

    public WebElement btnPayByCheck() {
        return BtnPayByCheck;
    }

    public WebElement btnConfirmMyOrder() {
        return BtnConfirmMyOrder;
    }

    public void validaConOrderConfirmed() {
        String MsgAuthentication = TitleOrderConfirmation.getText();
        Assert.assertEquals("ORDER CONFIRMATION", MsgAuthentication);
    }

    public WebElement btnBackToOrders() {
        return BtnBackToOrders;
    }
}
