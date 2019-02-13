package ExtentReport;

import com.relevantcodes.extentreports.LogStatus;
import freemarker.template.utility.StringUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;



public class TestLogger {

    public static void log(final String message) {
        Reporter.log(message, true);
        ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final StringUtil message) {
        Reporter.log(message + "<br>", true);
        ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final String message, WebDriver driver) {
        Reporter.log(message + "<br>", true);
        ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }


}
