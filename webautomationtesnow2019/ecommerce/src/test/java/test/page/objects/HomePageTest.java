package test.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends HomePage {

    WebDriver driver = null;
    @BeforeMethod
     public void setUp(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ang43\\Desktop\\webautomationtesnow2019\\generic\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.ghbass.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @Test
    public void searchTest()  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("navsearchbox")).sendKeys("shoes", Keys.ENTER);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
        System.out.println("End of Test");
    }


    }

