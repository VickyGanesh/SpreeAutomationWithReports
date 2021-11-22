package org.example;



import SpreePageFactory.*;
import org.checkerframework.checker.units.qual.C;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Login
     * Click on the first category
     * Select the first product
     * Add the product to cart
     * Complete the checkout flow by entering the Billing address
     * Select a random shipping method
     * Place order using check payment
     */

    WebDriver webDriver;

    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    AddressPage addressPage;
    ShippingMethodPage shippingMethodPage;
    PaymentPage paymentPage;

    @BeforeMethod
    public void setWebDriver(){
    System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver");
    webDriver = new ChromeDriver();
    webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    webDriver.manage().window().maximize();
    webDriver.get("https://spree-vapasi-prod.herokuapp.com/login");
    //loginPage.login("vickyganesh@gmail.com" , "vickyganesh" , "https://spree-vapasi-prod.herokuapp.com/login");
        loginPage =new LoginPage(webDriver);
        loginPage.login("vicky@gmail.com" , "iamvicky");
    }

    @AfterMethod
    public void logOut(){
     // productPage  = new ProductPage(webDriver);

    productPage.clickLogout();
    webDriver.quit();
    }

    @Test
    public void orderAProduct(){
        productPage  = new ProductPage(webDriver);
        productPage.selectProduct();
        cartPage = new CartPage(webDriver);
        cartPage.addToCart();
        addressPage = new AddressPage(webDriver);
        addressPage.addBillingAddress("Aadvik" , "Ganesh" ,
                "Seattle MainRoad", "Seattle_kurukkusandhu" , "Seattle","98101","9999900000");
        shippingMethodPage = new ShippingMethodPage(webDriver);
        shippingMethodPage.selectShippingMethod();
        paymentPage = new PaymentPage(webDriver);
        paymentPage.makePayment();


    }

}
