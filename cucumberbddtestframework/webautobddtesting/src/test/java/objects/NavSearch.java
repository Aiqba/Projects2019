package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavSearch extends ApplicationPageBase {

    @FindBy(how = How.ID, using = "navsearchbox" )

    private WebElement searchBox;

    public String search(){
        searchBox.sendKeys("Sale", Keys.ENTER);
        String actualText = driver.findElement(By.partialLinkText("Sale")).getText();

        return actualText;
    }
}
