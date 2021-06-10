package steps;

import commons.SeleniumRobot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.*;

public class AvaliaProdutoSteps {

    AuthenticationPage authenticationPage = new AuthenticationPage();
    CreateAnAccountPage createAccountPage = new CreateAnAccountPage();
    CategoryPage categoryPage = new CategoryPage();
    ProductPage productPage = new ProductPage();
    MyAccountPage myAccount = new MyAccountPage();
    ModalPage modalPage = new ModalPage();


    @Given("^que insiro os dados de login corretos$")
    public void que_insiro_os_dados_de_login_corretos() throws Throwable {
        authenticationPage.validaPaginaAutenticacao();
        this.authenticationPage.getInputEmail().sendKeys("talita.cabreira@live.com185");
        this.createAccountPage.getInputPassword().sendKeys("0x34g4qm7xfotdkyn");
        this.authenticationPage.BtnSubmitLogin();
        myAccount.validaPaginaMyAccount();
    }

    @Given("^navego para o menu Evening Dresses$")
    public void navego_para_o_menu_Evening_Dresses() throws Throwable {
        SeleniumRobot.MoveToElementWeb(myAccount.getTitleDresses());
        SeleniumRobot.MoveToElementWebClick(myAccount.getTitleEveningDresses());
    }

    @When("^selecionar o vestido$")
    public void selecionar_o_vestido() throws Throwable {
        this.categoryPage.productPrintedDress().click();
    }

    @When("^avaliar o produto$")
    public void avaliar_o_produto() throws Throwable {
        this.productPage.btnReviews().click();
        this.modalPage.getSelectFiveStar().click();
        this.modalPage.getCommentTitle().sendKeys("Avaliando Produto");
        this.modalPage.getCommentComment().sendKeys("UM TEXTO QUALQUER");
    }

    @Then("^envio a avaliacao$")
    public void envio_a_avaliacao() throws Throwable {
        this.modalPage.getBtnSubmitNewMessage().click();
        modalPage.validaNewComment();
        this.modalPage.getBtnOkModal().click();
    }
}
