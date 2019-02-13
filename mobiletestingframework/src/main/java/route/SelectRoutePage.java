package route;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SelectRoutePage extends MobileAPI {
    @FindBy(className = "android.widget.TextView")
    public List<WebElement> searchBoxClassName = new ArrayList<>();

    public void selectRoute(){
        searchBoxClassName.get(0).click();
        searchBoxClassName.get(1).sendKeys("Astoria");

    }
}
