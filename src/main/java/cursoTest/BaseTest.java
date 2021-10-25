package cursoTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @Before
    public void abreNavegador(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.lojaexemplodelivros.com.br/");
        driver.manage().window().maximize();
    }

    @After
    public void fechaNavegador(){
        driver.quit();
    }
}
