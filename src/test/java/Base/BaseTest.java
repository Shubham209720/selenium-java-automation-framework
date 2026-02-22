package Base;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import Utils.ExtentManager;

public class BaseTest {

    protected WebDriver driver;

    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void setup(Method method) {

        test = extent.createTest(method.getName());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        }
        else if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        }
        else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test Skipped");
        }

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void flushReport() {
        extent.flush();
    }
}