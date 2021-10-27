package cursoTest;

import core.Driver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void abreNavegador() {
        Driver.abreNavegador("http://www.lojaexemplodelivros.com.br/");
    }

    @After
    public void fechaNavegador(){
        Driver.fechaNavegador();
    }

}
