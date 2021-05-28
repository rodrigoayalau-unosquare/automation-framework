package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static base.DriverFactory.*;

public class SetupFactory {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void setUp(){
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @BeforeClass
    public void reachPage(){
        driver.get("http://127.0.0.1:5500/html5/bootstrap-5.0.0/shop/sign-in/index.html");
    }

    @AfterSuite(enabled=true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
