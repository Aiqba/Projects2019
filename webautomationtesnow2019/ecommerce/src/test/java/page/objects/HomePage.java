package page.objects;


import application.page.base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends ApplicationPageBase {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchBox;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "contact us")
    private WebElement cotactUs;

    @FindBy(how = How.CLASS_NAME, using = "ContinueAccountSetupForm")
    private WebElement LoginButton;



    public LoginPage getLogInPage() {
     LoginButton.click();
        return new LoginPage();
    }

    public void clickContactUs(){

        ApplicationPageBase.isEnaleStatus(driver, cotactUs);
        cotactUs.click();

    }
    public String search () {

        searchBox.sendKeys("Shoes", Keys.ENTER);
        String actualText = driver.findElement(By.partialLinkText("")).getText();

        return actualText;
    }
    }












