package cursoTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class LojaVirtualTest extends BaseTest {

    @Test
    public void testPesquisaLivro() {
        WebElement pesquisa = driver.findElement(By.id("search"));
        pesquisa.sendKeys("fortaleza digital", Keys.ENTER);
        WebElement elTituloLivro = driver.findElement(By.xpath("//ul/li/h2/a"));
        String livro = elTituloLivro.getText();
        Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
        WebElement elPreco = driver.findElement(By.cssSelector("#product-price-44 > span"));
        String preco = elPreco.getText();
        Assert.assertEquals("R$519,90", preco);

    }

    @Test
    public void testPesquisaLivro_AssertThat() {
        WebElement pesquisa = driver.findElement(By.id("search"));
        pesquisa.sendKeys("fortaleza digital", Keys.ENTER);
        WebElement elTituloLivro = driver.findElement(By.xpath("//ul/li/h2/a"));
        String livro = elTituloLivro.getText();
        Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
        WebElement elPreco = driver.findElement(By.cssSelector("#product-price-44 > span"));
        String preco = elPreco.getText();
        assertThat("R$519,90", is(preco));
        assertThat("R$519,90", containsString(preco));

    }

    @Test
    public void testClickLista() {
        WebElement pesquisa = driver.findElement(By.id("search"));
        pesquisa.sendKeys("html", Keys.ENTER);
        List<WebElement> elLivros = driver.findElements(By.cssSelector("ul.products-grid > li"));
        for (WebElement elLivro : elLivros) {
            WebElement elTituloLivro = elLivro.findElement(By.cssSelector("h2 > a"));
            String tituloLivro = elTituloLivro.getText();
            if (tituloLivro.contains("Ajax com Java")) {
                WebElement elpreco = elLivro.findElement(By.cssSelector("span.price"));
                assertThat("R$444,50", is(elpreco.getText()));

            }
        }

    }

}
