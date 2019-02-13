package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageSource extends BrowserDriver {

    @FindBy(how = How.PARTIAL_LINK_TEXT, className = "view-source")
    private WebElement PageSource;

    public String search() {
        PageSource.click();

        return search();

    }

}
