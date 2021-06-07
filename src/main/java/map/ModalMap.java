package map;

import commons.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalMap {

    public ModalMap() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    protected WebElement TitleProductSuccessAdded;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    protected WebElement BtnContinueShopping;

    @FindBy(linkText = "Proceed to checkout")
    protected WebElement BtnProceedToCheckout;

    @FindBy(xpath = "//*[@class='star']/a[text()='5']")
    protected WebElement selectFiveStar;

    @FindBy (id = "comment_title")
    protected WebElement getCommentTitle;

    @FindBy (id = "content")
    protected WebElement getCommentComment;

    @FindBy (id = "submitNewMessage")
    protected WebElement btnSubmitNewMessage;

    @FindBy(xpath = "//*[@class='fancybox-inner']/h2[text()='New comment']")
    protected WebElement txtNewComment;

    @FindBy(xpath = "//button[@type='submit']/span[text()='OK']")
    protected WebElement BtnOkModal;
}
