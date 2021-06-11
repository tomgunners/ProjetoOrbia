package steps;

import commons.SeleniumRobot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.*;

public class RealizaCompraSteps {

    AuthenticationPage authenticationPage = new AuthenticationPage();
    CreateAnAccountPage createAccountPage = new CreateAnAccountPage();
    CategoryPage categoryPage = new CategoryPage();
    ProductPage productPage = new ProductPage();
    MyAccountPage myAccount = new MyAccountPage();
    ModalPage modalPage = new ModalPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();

    @Given("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws Throwable {
        authenticationPage.validaPaginaAutenticacao();

    }

    @And("^insiro os dados de login corretos$")
    public void insiro_os_dados_de_login_corretos() throws Throwable {
        this.authenticationPage.getInputEmail().sendKeys("talita.cabreira@live.com185");
        this.createAccountPage.getInputPassword().sendKeys("0x34g4qm7xfotdkyn");
        this.authenticationPage.BtnSubmitLogin();
        myAccount.validaPaginaMyAccount();
    }

    @When("^navegar para o menu Evening Dresses$")
    public void navegar_para_o_menu_Evening_Dresses() throws Throwable {
        SeleniumRobot.MoveToElementWeb(myAccount.getTitleDresses());
        SeleniumRobot.MoveToElementWebClick(myAccount.getTitleEveningDresses());
        this.categoryPage.productPrintedDress().click();
    }

    @And("^selecionar o vestido com cores e tamanhos diferentes$")
    public void selecionar_o_vestido_com_cores_e_tamanhos_diferentes() throws Throwable {
        SeleniumRobot.scroll(3);
        SeleniumRobot.selectByindex(2, this.productPage.selectSize());
        this.productPage.selectColorPink().click();
        this.productPage.btnAddToCard().click();

        //modalPage.validaModal();
        modalPage.getBtnContinueShopping().click();
        SeleniumRobot.selectByindex(1, this.productPage.selectSize());
        this.productPage.selectColorBeige().click();
        this.productPage.btnAddToCard().click();
        modalPage.getBtnProceedToCheckout().click();
    }

    @Then("^vou finalizar o pedido$")
    public void vou_finalizar_o_pedido() throws Throwable {
        this.checkoutPage.btnProceedToCheckout().click();
        this.checkoutPage.btnAddressProceedToCheckout().click();
        this.checkoutPage.chkTermsOfService().click();
        this.checkoutPage.btnShippingProceedToCheckout().click();
        this.checkoutPage.btnPayByCheck().click();
        this.checkoutPage.btnConfirmMyOrder().click();
        checkoutPage.validaConOrderConfirmed();
        this.checkoutPage.btnBackToOrders().click();
        //this.orderHistoryPage.validaPagamentoComCheque();
    }
}
