package cursoTest;

import core.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.InicialPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class LojaVirtualTest extends BaseTest {
    InicialPage inicialPage = new InicialPage();
    @Test
    public void testPesquisaLivro() {
        Driver.setUrl("http://www.lojaexemplodelivros.com.br/");
        inicialPage.setPesquisa("fortaleza digital", Keys.ENTER);
        String livro = inicialPage.getTituloLivro();
        Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
        String preco = inicialPage.getPreco();
        Assert.assertEquals("R$519,90", preco);

    }

    @Test
    public void testPesquisaLivro_AssertThat() {
        Driver.setUrl("http://www.lojaexemplodelivros.com.br/");
        inicialPage.setPesquisa("fortaleza digital\", Keys.ENTER");
        String livro = inicialPage.getTituloLivro();
        Assert.assertEquals("[PRODUTO DE EXEMPLO] - A Cabeça de Steve Jobs", livro);
        String preco = inicialPage.getPreco();
        assertThat("R$519,90", is(preco));
        assertThat("R$519,90", containsString(preco));

    }

    @Test
    public void testClickLista() {
        Driver.setUrl("http://www.lojaexemplodelivros.com.br/");
        inicialPage.setPesquisa("html",Keys.ENTER);
        String preco = inicialPage.getPrecoLista();
        assertThat("R$444,50", is (preco));
    }

}
