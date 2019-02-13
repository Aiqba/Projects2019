package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends ApplicationPageBase {
    private WebDriver driver;
    @FindBy(how = How.ID, id = "loginEmail")
    private WebElement emailBox;

    @FindBy(how = How.ID, id = "loginPassword2")
    private WebElement passwordBox;

    @FindBy(how = How.CLASS_NAME, css = "loginemail_email_textbox")
    private WebElement textbox;

    @FindBy(how = How.CLASS_NAME, css = "#center_column > div.alert.alert-danger > p")
    private WebElement errorMessage;


    public LoginPage login(String email, String password){
        sendKeys(emailBox,"emailBox", email);
        sendKeys(passwordBox, "passwordBox", password);

        return new LoginPage();
    }
    public String getErrorMessage(){
        
        String actualText = getText(errorMessage,"errorMessage");
        
        return actualText;
    }

}
