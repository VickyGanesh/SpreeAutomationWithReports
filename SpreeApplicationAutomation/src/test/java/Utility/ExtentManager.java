package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;

public class ExtentManager extends TestListener {

    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {

        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report" +
                TestListener.getTestMethodName() +".html");
        extentReports.attachReporter(reporter);
        return extentReports;
    }

}
