package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");

            spark.config().setTheme(Theme.DARK);
            spark.config().setReportName("DemoQA Automation Report");
            spark.config().setDocumentTitle("Automation Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Shubham");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Environment", "QA");
        }

        return extent;
    }
}