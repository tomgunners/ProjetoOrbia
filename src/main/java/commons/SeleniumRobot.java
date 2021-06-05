package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumRobot {

    protected static WebDriver driver;
    //Variavel WAIT GLOBAL
    protected static WebDriverWait wait;

    public static void implicitlyWait(Long timeOut) {
        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
    }

    public static void selectByindex(int index, WebElement listId){
        Select select = new Select(listId);
        select.selectByIndex(index);
    }

    /**
     * espera uma lista de elemento ser visivel
     *
     * @param elements
     */
    public static void explicityAllWait(List<WebElement> elements) {

        wait.until(ExpectedConditions.visibilityOfAllElements(elements));

    }

    /**
     * espera o elemento ser clicavel
     *
     * @param element
     */
    public static void waitElementoTobeClick(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    /**
     * valida se existe um elemento na parte web
     *
     * @param xpath
     * @return true or false
     */
    public static boolean existElementWeb(String xpath) {

        return driver.findElements(By.xpath(xpath)).size() != 0;

    }

    /**
     * o metodo faz uma simulação de double click
     *
     * @param element
     */
    public static void DoubleClickWeb(WebElement element) {
        Actions DoubleClick = new Actions(driver);
        DoubleClick.doubleClick(element).perform();
    }

    /**
     * faz um foco no elemente que deseja e insere um texto
     *
     * @param element
     * @param texto
     */
    public static void escrever(WebElement element, String texto) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click();
        actions.sendKeys(texto).build().perform();
    }

    /**
     * move até o elemento esperado
     *
     * @param element
     */
    public static void MoveToElementWeb(WebElement element) {
        Actions MoveToElement = new Actions(driver);
        MoveToElement.moveToElement(element).perform();
    }

    public static void moveToElementLightning(WebElement element) {
        int y = element.getLocation().y;
        scroll(y-500);
    }

    public static void moveToElementLightningTaxaPV(WebElement element) {
        int y = element.getLocation().y;
        scroll(y-900);
    }

    /**
     * valida se existe os elementos
     *
     * @param element
     */
    public static void waitElementExists(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * retorna a quantidade de elementos
     *
     * @param element
     * @return quantidade
     */
    public static int countElements(String element) {
        return driver.findElements(By.xpath(element)).size();
    }

    /**
     * espera o elemento ser visível
     *
     * @param element
     */
    public static void waitElementInvisibility(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitElementVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    /**
     * espera o elemento invisivel ser clicavel
     *
     * @param xpath
     */
    public static void waitElementInvisible(String xpath) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    /**
     * @param rolagem
     */
    public static void scroll(int rolagem) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + rolagem + ")", "");
    }

    public static void scrollElement(String xpath){
        try {
            do {
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(" + 100 + "," + 1000 + ");");
                TimeUnit.SECONDS.sleep(3);
            } while (!SeleniumRobot.existElementWeb(xpath));

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void clicaElemento(WebElement elemento){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", elemento);
    }

    public static void clickByText(String text){
        driver.findElement(By.xpath("//*[text()='" +text+ "']")).click();
    }
}
