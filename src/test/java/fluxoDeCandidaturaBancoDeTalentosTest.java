import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class fluxoDeCandidaturaBancoDeTalentosTest {
    private WebDriver navegador;
    @Before
    public void setUP(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\t.mousinho.de.lima\\drives\\chromedriver.exe");
    navegador = new ChromeDriver();
    navegador.get("https://nayaracorporation.solides.jobs/");
    navegador.manage().window().maximize();
    navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testCandidaturaAoBancoDeTalentos(){

        // Acessar formulário
        navegador.findElement(By.id("hs-eu-confirmation-button")).click();
        navegador.findElement(By.id("registerTalentBank")).click();
        navegador.findElement(By.id("register")).click();

        // Dados do formulário
        navegador.findElement(By.xpath("//form//div//div//div//input[@name='email']")).sendKeys("teste@teste.com.br");
        navegador.findElement(By.xpath("//form//div//div//div//input[@name='cpf']")).sendKeys("32841137031");
        navegador.findElement(By.xpath("//form/div[3]/div/div/input")).sendKeys("123456");
        navegador.findElement(By.xpath("//form/div[4]/div/div/input")).sendKeys("123456");
        navegador.findElement(By.xpath("//form/div[5]/div/div/div/div/label")).click();




        //WebDriverWait AguardarForm = new WebDriverWait(navegador, 10);
        //AguardarForm.until(ExpectedConditions.visibilityOf((name))).click();



                //sendKeys("teste@teste.com.br");

    }
}
