package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavSearch extends BrowserDriver {

    @FindBy(how = How.ID, using = "navsearchbox" )

    private WebElement searchBox;

    public String search(){
        searchBox.sendKeys("Sale", Keys.ENTER);
        String actualText = driver.findElement(By.partialLinkText("Sale")).getText();

        return actualText;
    }





}
