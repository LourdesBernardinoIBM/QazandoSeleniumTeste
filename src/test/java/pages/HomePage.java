package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://qazando.com.br/curso.html");
        esperarElementoEstarPresente("btn-ver-cursos", 10);
        Assert.assertEquals( "Não acessou a aplicação!",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(s:"window.scrollTo(0,10000");
        Duration millis;
        Theread.sleep(millis:2000)
    }

    public void preencheEmail
             driver.findElement(By.id("email")).sendKeys("bernardino.mlb@gmail.com");

    public void preencheEmail() {
        driver.findElement(By.id("email")).sendKeys( "bernardino.mlb@gmail.com");
    }

    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals( "O cupom está errado!", "QAZANDO15OFF", texto_cupom);


    }
}
