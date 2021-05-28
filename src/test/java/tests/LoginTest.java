package tests;

import base.SetupFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;

import static base.DriverFactory.*;
import static pages.LoginPage.*;
import static pages.CheckoutPage.*;

public class LoginTest extends SetupFactory {

    WebDriver driver = getDriver();

    LoginPage login = getLoginPage();
    CheckoutPage check = getCheckoutPage();

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        login.setKeys("admin", "admin");

    }

    @Test(priority = 2, enabled = true)
    public void isSelectedTest(){
        check.isSelectedCredit();
    }



}
