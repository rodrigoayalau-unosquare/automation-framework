package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static base.DriverFactory.getDriver;
import static base.DriverFactory.getWebDriverWait;

public class CheckoutPage {


    WebDriver driver = getDriver();
    WebDriverWait wait = getWebDriverWait();

    public static CheckoutPage getCheckoutPage(){
        return new CheckoutPage();
    }

    public boolean isSelectedCredit() throws InterruptedException {
        WebElement creditCard = driver.findElement(By.xpath("//input[@id='credit']"));
        DriverFactory.sleep();
        return creditCard.isSelected();
    }

    public void verifyIsSelected(By element) {
        driver.findElement(element).isSelected();
    }

    public static By paymentIsSelected() {
        return By.xpath("//input[@id='credit']");
    }



}
