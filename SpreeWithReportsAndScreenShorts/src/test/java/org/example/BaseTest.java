package org.example;

import SpreePageFactory.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    LoginPage loginPage;
    static ExtentTest test;
    static ExtentReports report;

    @BeforeTest
    public void setExtentReport(){
        report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
    }
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
        loginPage.clickLogout();
        webDriver.quit();
    }
    @AfterMethod
    public void getResult(ITestResult result) throws Exception {
        if(result.getStatus() == ITestResult.FAILURE){
            test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
            test.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
            String screenshotPath = BaseTest.getScreenshot(webDriver, result.getName());
            test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
        }
        else if(result.getStatus() == ITestResult.SKIP){
            test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
        }
        report.endTest(test);
    }
    @AfterTest
    public void endReport(){
        report.flush();
        report.close();
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
        String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }


}
