package tests;

import base.SetupFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static base.DriverFactory.*;
import static pages.LoginPage.*;
import static pages.CheckoutPage.*;

public class LoginTest extends SetupFactory {

    WebDriver driver = getDriver();
    WebDriverWait wait = getWebDriverWait();

    LoginPage login = getLoginPage();
    CheckoutPage check = getCheckoutPage();

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        login.setKeys("admin", "admin");

    }

    @Test(priority = 2, enabled = true)
    public void isSelectedTest() throws InterruptedException {
        check.isSelectedCredit();
    }



}
