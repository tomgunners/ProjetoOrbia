package page;

import hook.Hooks;
import map.CreateAnAccountMap;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import util.RandomPasswordGenerator;

public class CreateAnAccountPage extends CreateAnAccountMap {

    RandomPasswordGenerator passGen = new RandomPasswordGenerator();
    String password = passGen.generatePassayPassword();

    public CreateAnAccountPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void validaPaginaAutenticacao() throws Exception {
        String TitleCreateAnAccount = TitleCreateAccount.getText();
        Assert.assertEquals("YOUR PERSONAL INFORMATION", TitleCreateAnAccount);
    }

    public void mrs() {
        RdbMr.click();
    }

    public void firstName() {
        TxtFindName.sendKeys("Teste");
    }

    public void lastName() {
        TxtLastName.sendKeys("Teste");
    }

    /*public void email() {
        TxtEmail.sendKeys("yamilei1013@uorak.com");
    }*/

    public void password() {
        TxtPassword.sendKeys(password);
        System.out.println("Senha Cadastrada" + password);
    }

    public void dateOfBith(){
        Select days = new Select(CmbDays);
        days.selectByValue("13");

        Select months = new Select(CmbMonths);
        months.selectByValue("4");

        Select years = new Select(CmbYears);
        years.selectByValue("1990");
    }

    public void company() {
        TxtCompany.sendKeys("Orbia");
    }

    public void address() {
        TxtAddress.sendKeys("1520 Pooz Street");
    }

    public void city() {
        TxtCity.sendKeys("New York");
    }

    public void state(){
        Select state = new Select(CmbState);
        state.selectByValue("32");
    }

    public void zipCode() {
        TxtZipCode.sendKeys("94232");
    }

    public void additionalInformation(){
        TxtAdditionalInformation.sendKeys("Automacao de Teste Orbia");
    }

    public void homePhone(){
        TxtHomePhone.sendKeys("732-223-6870");
    }

    public void mobilePhone(){
        TxtMobilePhone.sendKeys("732-223-6870");
    }

    public void secondAddress(){
        TxtSecondAddress.sendKeys("essaadia8713@uorak.com");
    }

    public void register(){
        BtnRegister.click();
    }
}
