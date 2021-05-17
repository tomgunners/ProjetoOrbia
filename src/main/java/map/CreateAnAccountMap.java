package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountMap {

    public CreateAnAccountMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/h3")
    protected WebElement TitleCreateAccount;

    @FindBy(id = "id_gender1")
    protected WebElement RdbMr;

    @FindBy(id = "id_gender2")
    protected WebElement RdbMrs;

    @FindBy(id = "customer_firstname")
    protected WebElement TxtFindName;

    @FindBy(id = "customer_lastname")
    protected WebElement TxtLastName;

    @FindBy(id = "email")
    protected WebElement TxtEmail;

    @FindBy(id = "passwd")
    protected WebElement TxtPassword;

    @FindBy(id = "days")
    public WebElement CmbDays;

    @FindBy(name = "months")
    protected WebElement CmbMonths;

    @FindBy(name = "years")
    protected WebElement CmbYears;

    //YOUR ADDRESS

    @FindBy(id = "company")
    protected WebElement TxtCompany;

    @FindBy(id = "address1")
    protected WebElement TxtAddress;

    @FindBy(id = "city")
    protected WebElement TxtCity;

    @FindBy(id = "id_state")
    protected WebElement CmbState;

    @FindBy(id = "postcode")
    protected WebElement TxtZipCode;

    @FindBy(id = "other")
    protected WebElement TxtAdditionalInformation;

    @FindBy(id = "phone")
    protected WebElement TxtHomePhone;

    @FindBy(id = "phone_mobile")
    protected WebElement TxtMobilePhone;

    @FindBy(id = "alias")
    protected WebElement TxtSecondAddress;

    @FindBy(id = "submitAccount")
    protected WebElement BtnRegister;

    @FindBy(linkText = "Dresses")
    protected WebElement MnDresses;
}
