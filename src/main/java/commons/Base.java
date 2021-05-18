package commons;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Base {

    //Variavel WEBDRIVER GLOBAL
    protected static WebDriver driver;
    //Variavel WAIT GLOBAL
    protected static WebDriverWait wait;

    //CONSTRUTOR RESPONSÁVEL POR INICIAR O NAVEGADOR
    @Before
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    //CONSTRUTOR RESPONSÁVEL POR FECHAR O NAVEGADOR
    @After
    public void teardown() {
        driver.quit();
    }

    //CONSTRUTOR QUE RECEBE DE VOLTA O DRIVER
    public static WebDriver getDriver() {
        return driver;
    }

}
