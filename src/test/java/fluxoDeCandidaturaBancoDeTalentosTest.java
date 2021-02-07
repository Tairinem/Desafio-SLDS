import org.junit.Assert;
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
    navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    navegador.findElement(By.id("hs-eu-confirmation-button")).click();

    }

    //@Test
    public void testCadastroDeCandidato(){

        // Acessar formulário
        navegador.findElement(By.id("registerTalentBank")).click();
        navegador.findElement(By.id("register")).click();

        // Dados do formulário
        navegador.findElement(By.xpath("//form//div//div//div//input[@name='email']")).sendKeys("teste2@teste.com.br");
        navegador.findElement(By.xpath("//form//div//div//div//input[@name='cpf']")).sendKeys("53046836090");
        navegador.findElement(By.xpath("//form/div[3]/div/div/input")).sendKeys("T124476");
        navegador.findElement(By.xpath("//form/div[4]/div/div/input")).sendKeys("T124476");
        navegador.findElement(By.xpath("//form/div[5]/div/div/div/div/label")).click();

        //Finalizar cadastro
        navegador.findElement(By.xpath("//form/div[6]/button[@type='submit']")).click();

        WebElement PaginaDeInformacoes = navegador.findElement(By.xpath("//div[1]/p/strong[text()=' preencha duas etapas:']"));
        String MSG = PaginaDeInformacoes.getText();
        Assert.assertEquals("preencha duas etapas:",MSG);

    }

    @Test
    public void testAcessarPaginaDepoisDeCadastro(){
        navegador.findElement(By.xpath("//div/div[1]/div/div[3]/div[2]/button")).click();

        navegador.findElement(By.xpath("//form/div[1]/div/div/input[@name='user']")).sendKeys("teste1@teste.com.br");
        navegador.findElement(By.xpath("//div/div[2]/div[2]/div/form/div[2]/div/div/input")).sendKeys("T124456");
        navegador.findElement(By.xpath("//div/div[2]/div[2]/div/form/div[4]/button")).click();

        WebElement PaginaDeInformacoes = navegador.findElement(By.xpath("//div[1]/p/strong[text()=' preencha duas etapas:']"));
        String MSG = PaginaDeInformacoes.getText();
        Assert.assertEquals("preencha duas etapas:",MSG);

    }
}
