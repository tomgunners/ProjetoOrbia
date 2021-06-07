package page;

import map.CreateAnAccountMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CreateAnAccountPage extends CreateAnAccountMap {

    public void validaPaginaAutenticacao() {
        String TitleCreateAnAccount = TitleCreateAccount.getText();
        Assert.assertEquals("YOUR PERSONAL INFORMATION", TitleCreateAnAccount);
    }

    public WebElement getRdMr() {
        return RdbMr;
    }

    public WebElement getInputFirstName() {
        return TxtFindName;
    }

    public WebElement getInputLastName() {
        return TxtLastName;
    }

    public WebElement getCompany(){
        return TxtCompany;
    }

    public WebElement getInputPostalCode() {
        return TxtZipCode;
    }

    public WebElement getInputPassword() {
        return TxtPassword;
    }

    public WebElement getSelectDateBirth() {
        return selectDateBirth;
    }

    public WebElement getInputAddress() {
        return TxtAddress;
    }

    public WebElement getInputCity() {
        return TxtCity;
    }

    public WebElement getSelectState() {
        return SelectState;
    }

    public WebElement getSelectCountry() {
        return SelectCountry;
    }

    public WebElement getInputHomePhone() {
        return TxtHomePhone;
    }

    public WebElement getInputPhone() {
        return TxtMobilePhone;
    }

    public WebElement getInputAddressAlias() {
        return TxtSecondAddress;
    }

    public WebElement getRegister() {
        return BtnRegister;
    }
}
