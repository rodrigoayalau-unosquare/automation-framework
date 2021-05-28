package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:/explorer_drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    @SuppressWarnings("deprecation")
    public static WebDriverWait getWebDriverWait() {
        if(wait == null) {
            wait = new WebDriverWait(getDriver(), 5);
        }
        return wait;
    }
}
