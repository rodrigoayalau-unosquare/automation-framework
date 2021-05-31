package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverFactory.*;

public class LoginPage {

    WebDriver driver = getDriver();
    WebDriverWait wait = getWebDriverWait();

    public static LoginPage getLoginPage(){
        return new LoginPage();
    }

    public LoginPage setKeys(String id, String pass) throws InterruptedException {
        WebElement idInput = driver.findElement(By.id("emailInput"));
        idInput.sendKeys(id);
        WebElement passInput = driver.findElement(By.id("passwordInput"));
        passInput.sendKeys(pass);
        WebElement button = driver.findElement(By.xpath("/html/body/main/form/button"));
        sleep();
        button.click();
        return this;
    }
}
