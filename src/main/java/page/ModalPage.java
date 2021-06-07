package page;

import map.ModalMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ModalPage extends ModalMap {

    public void validaModal() {
        String MsgAuthentication = TitleProductSuccessAdded.getText();
        Assert.assertEquals("Product successfully added", MsgAuthentication);
    }

    public WebElement getBtnContinueShopping(){
        return BtnContinueShopping;
    }

    public WebElement getBtnProceedToCheckout(){
        return BtnProceedToCheckout;
    }

    public WebElement getSelectFiveStar(){
        return selectFiveStar;
    }

    public WebElement getCommentTitle(){
        return getCommentTitle;
    }

    public WebElement getCommentComment(){
        return getCommentComment;
    }

    public WebElement getBtnSubmitNewMessage(){
        return btnSubmitNewMessage;
    }

    public WebElement getTxtNewComment(){
        return txtNewComment;
    }

    public void validaNewComment() {
        String MsgAuthentication = txtNewComment.getText();
        Assert.assertEquals("New comment", MsgAuthentication);
    }

    public WebElement getBtnOkModal(){
        return BtnOkModal;
    }
}
