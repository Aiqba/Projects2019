package stepdefinitios;

import base.ApplicationPageBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Hook extends ApplicationPageBase {

    @Before
    public void initializeTest() {
        String getOsNameFromSystem = System.getProperty("os.name");
        String browserName = System.getProperty("browser", "chrome");
        if (browserName.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            System.out.println("Opening the browser : Chrome");
            if (getOsNameFromSystem.contains("Mac")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\ang43\\Desktop\\cucumberbddtestframework\\webautobddtesting\\drivers\\chromedriver.exe");
            } else if (getOsNameFromSystem.contains("Windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\ang43\\Desktop\\cucumberbddtestframework\\webautobddtesting\\drivers\\chromedriver.exe");
            }
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--private");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);


            if (getOsNameFromSystem.contains("Windows")) {
                if (getOsNameFromSystem.contains("Mac")) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ang43\\Desktop\\cucumberbddtestframework\\webautobddtesting\\drivers\\chromedriver.exe");
                } else if (getOsNameFromSystem.contains("Windows")) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ang43\\Desktop\\cucumberbddtestframework\\webautobddtesting\\drivers\\chromedriver.exe");
                }
                driver = new FirefoxDriver(capabilities);
            }

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); //35
            driver.get("https://www.ghbass.com");

        }
    }
    @After
    public void tearDownTest(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : chrome");
        driver.quit();


            }
        }


