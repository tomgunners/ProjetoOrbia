package steps;

import com.github.javafaker.Faker;
import commons.DataGenerator;
import commons.SeleniumRobot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AuthenticationPage;
import page.CreateAnAccountPage;
import page.MyAccountPage;

public class CriarContaSteps {

    AuthenticationPage authenticationPage = new AuthenticationPage();
    CreateAnAccountPage createAccountPage = new CreateAnAccountPage();
    MyAccountPage myAccount = new MyAccountPage();
    Faker faker = new Faker();
    DataGenerator dataGenerator = new DataGenerator();


    @Given("^que estou na tela de pré cadastro$")
    public void que_estou_na_tela_de_pré_cadastro() {
        authenticationPage.validaPaginaAutenticacao();
    }

    @And("^insiro um email valido$")
    public void insiro_um_email_valido() {
        this.authenticationPage.getInputEmailCreate().sendKeys(dataGenerator.getEmail());
        System.out.println("Email Cadastrada:" + dataGenerator.getEmail());

        authenticationPage.cliqueNoBotaoLogarHome();

    }

    @When("^redirecionar para a tela seguinte$")
    public void redirecionar_para_a_tela_seguinte() {
        createAccountPage.validaPaginaAutenticacao();
    }

    @Then("^preencho as informações pessoais$")
    public void preencho_as_informações_pessoais() {
        this.createAccountPage.getRdMr().click();
        this.createAccountPage.getInputFirstName().sendKeys(faker.name().firstName());
        this.createAccountPage.getInputLastName().sendKeys(faker.name().lastName());
        this.createAccountPage.getInputPassword().sendKeys(dataGenerator.getPassword());
        System.out.println("Senha Cadastrada:" + dataGenerator.getPassword());
        this.createAccountPage.getCompany().sendKeys("Orbia");
        this.createAccountPage.getInputAddress().sendKeys("Rua Teste");
        this.createAccountPage.getInputCity().sendKeys("São Paulo");
        SeleniumRobot.selectByindex(3, this.createAccountPage.getSelectState());
        this.createAccountPage.getInputPostalCode().sendKeys("94232");
        SeleniumRobot.selectByindex(1, this.createAccountPage.getSelectCountry());
        this.createAccountPage.getInputHomePhone().sendKeys("1156626293");
        this.createAccountPage.getInputPhone().sendKeys("11995356885");
        this.createAccountPage.getRegister().click();
    }

    @And("^devo ser redirecionado para a tela My Account$")
    public void devo_ser_redirecionado_para_a_tela_My_Account() throws Throwable {
        myAccount.validaPaginaMyAccount();
    }
}
