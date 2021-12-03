package org.example;

import static org.junit.Assert.assertTrue;

import SpreePageFactory.*;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest
{
    //public WebDriver webDriver;

    ProductPage productPage;
    CartPage cartPage;
    AddressPage addressPage;
    ShippingMethodPage shippingMethodPage;
    PaymentPage paymentPage;


    @Test
    public void verifySuccessMessage(){
        test = report.startTest("verifySuccessMessage test started");
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
        test.log(LogStatus.PASS , "Order Placed Successfully");
    }

    @Test
    public void verifyInvalidSuccessMessage(){
        test = report.startTest("verifyInvalidSuccessMessage test started");
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
        Assert.assertEquals(paymentPage.returnSuccessMessage(), "Your order has NOT been processed successfully");
        System.out.println("Assertion Error Happened");
    }

}
