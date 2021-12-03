package org.example;


import Reports.ExtentTestManager;
import SpreePageFactory.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   public WebDriver webDriver;

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
        webDriver.get("https://spree-vapasi.herokuapp.com/login");
        loginPage =new LoginPage(webDriver);
        loginPage.login("vicky@gmail.com" , "iamvicky");
    }

    @AfterMethod
    public void logOut(){
        productPage.clickLogout();
        webDriver.quit();
    }

    @Test
    public void verifySuccessMessage(){
        ExtentReports extent = new ExtentReports();
        ExtentTest test = extent.createTest("Verify Success Message");
        productPage  = new ProductPage(webDriver);
        productPage.selectProduct();
        cartPage = new CartPage(webDriver);
        cartPage.addToCart();
        addressPage = new AddressPage(webDriver);
        // addressPage.addBillingAddress("Aadvik" , "Ganesh","Seattle MainRoad", "Seattle_kurukkusandhu" , "Seattle","98101","9999900000");
        addressPage.clickSaveANdContinueButton();
        shippingMethodPage = new ShippingMethodPage(webDriver);
        shippingMethodPage.selectShippingMethod();
        paymentPage = new PaymentPage(webDriver);
        paymentPage.makePayment();
        Assert.assertEquals(paymentPage.returnSuccessMessage() , "Your order has been processed successfully");

    }




   /* @Test
    public void reportDemo(){
        ExtentHtmlReporter
    }*/
}
