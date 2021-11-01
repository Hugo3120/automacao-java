package cursoTest;

import core.Driver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void abreNavegador() {
        Driver.abreNavegador();
    }

    @After
    public void fechaNavegador(){
        Driver.fechaNavegador();
    }

}
