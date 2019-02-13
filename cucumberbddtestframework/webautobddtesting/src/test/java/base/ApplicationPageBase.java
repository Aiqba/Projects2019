package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationPageBase {

    String pageUrl;

    public static WebDriver driver = null;

    public static boolean isEnableStatus(WebDriver driver, WebElement web) {
        boolean en = web.isEnabled();
        return en;
    }
    public static void sendKeys(WebElement webElement, String webElementName, String keys) {
        webElement.clear();
        webElement.sendKeys(keys);
    }
    public static String getText(WebElement webElement, String webElementName) {

        String actualText = webElement.getText();
        return actualText;
    }
    public static void click(WebElement webElement, String webElementName){
        webElement.click();
    }
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        File filepath = new File(System.getProperty("user.dir") +  "/src/test/resources/secret.properties");
        InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
        prop.load(ism);
        ism.close();
        return prop;
    }

    }

