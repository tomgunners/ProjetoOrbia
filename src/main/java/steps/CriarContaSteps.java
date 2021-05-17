package steps;

import commons.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import page.AuthenticationPage;

public class CriarContaSteps {

    public static WebDriver driver;

    @Given("^que estou na tela de pré cadastro$")
    public void que_estou_na_tela_de_pré_cadastro() {
        new AuthenticationPage(driver).validaPaginaAutenticacao();
    }

    @And("^insiro um email valido$")
    public void insiro_um_email_valido() {
        new AuthenticationPage(driver).digiteEmailValido();
        new AuthenticationPage(driver).cliqueNoBotaoLogarHome();
    }

    @When("^redirecionar para a tela seguinte$")
    public void redirecionar_para_a_tela_seguinte() {
        //   informacoesPessoais.validaPaginaAutenticacao();
    }

    @Then("^preencho as informações pessoais$")
    public void preencho_as_informações_pessoais() throws Throwable {
     /*   informacoesPessoais.mrs();
        informacoesPessoais.firstName();
        informacoesPessoais.lastName();
        //informacoesPessoais.email();
        informacoesPessoais.password();
        informacoesPessoais.dateOfBith();
        informacoesPessoais.company();
        informacoesPessoais.address();
        informacoesPessoais.city();
        informacoesPessoais.state();
        informacoesPessoais.zipCode();
        informacoesPessoais.additionalInformation();
        informacoesPessoais.homePhone();
        informacoesPessoais.mobilePhone();
        informacoesPessoais.secondAddress();*/
    }

    @And("^devo ser redirecionado para a tela My Account$")
    public void devo_ser_redirecionado_para_a_tela_My_Account() throws Throwable {
        //  informacoesPessoais.register();
        //  meuPerfil.interageMenu();
    }
}
