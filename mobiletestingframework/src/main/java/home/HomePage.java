package home;

import base.MobileAPI;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class HomePage extends MobileAPI {

    TouchAction touchAction = new TouchAction(ad);

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> burgerBtn = new ArrayList<>();

    @FindBy(linkText = "Set home address")
    public WebElement setHomeAddress;
    @FindBy(id = "android:id/button1")
    public WebElement exploreGotIt;
    @FindBy(id = "android:id/button2")
    public WebElement cancelButton;
    @FindBy(id = "android:id/button1")
    public WebElement okButton;
    @FindBy(className = "android.widget.TextView")
    public WebElement setDestination;
    @FindBy(className = "android.widget.TextView")
    public List<WebElement> searchBoxClassName = new ArrayList<>();

    String menuArray[] = {"Your places", "Your timeline", "Your contributions", "Location sharing",
            "Start driving", "Explore", "Tips and tricks", "Add a missing place", "Settings",
            "Help", "Send feedback", "Terms of Service"};

   /*public void skipLogin() throws InterruptedException {
      touchAction.tap(1280,181).perform();
      //Thread.sleep(30000);

   }*/

   public void clickGps(){
       touchAction.tap(1275, 1977).perform();
   }

    public void getMenu() {
        burgerBtn.get(0).click();
    }

    public void getYourPlaces() {
        getMenu();
        scrollAndClickByName(menuArray[0]);
    }

    public void getYourTimeline() {
        getMenu();
        scrollAndClickByName(menuArray[1]);
    }

    public void getYourContributions() {
        getMenu();
        scrollAndClickByName(menuArray[2]);
    }

    public void getLocationSharing() {
        getMenu();
        scrollAndClickByName(menuArray[3]);
    }

    public void getStartDriving() {
        getMenu();
        scrollAndClickByName(menuArray[4]);
    }

    public void getExplore() {
        getMenu();
        scrollAndClickByName(menuArray[5]);
    }

    public void getTipsAndTricks() {
        getMenu();
        scrollAndClickByName(menuArray[6]);
    }

    public void getAddAMissingPlace() {
        getMenu();
        scrollAndClickByName(menuArray[7]);
    }

    public void getSettings() {
        getMenu();
        scrollAndClickByName(menuArray[8]);
    }

    public void getHelp() {
        getMenu();
        scrollAndClickByName(menuArray[9]);
    }

    public void getSendFeedback() {
        getMenu();
        scrollAndClickByName(menuArray[10]);
    }

    public void getTermsOfServices() {
        getMenu();
        scrollAndClickByName(menuArray[11]);
    }

    public void setHomeAddressInYourPlaces() {
        /*getMenu();
        getYourPlaces();*/
        burgerBtn.get(0).click();
        getYourPlaces();
        setHomeAddress.click();
    }

    public void mapTypeSatellite() {
        //clcik Map Type
        burgerBtn.get(5).click();
        burgerBtn.get(1).click();
    }
     public void mapTypeTerrain(){
        burgerBtn.get(5).click();
        //clcik Terrin
        burgerBtn.get(2).click();
     }
    public void startDriving() {
        getMenu();
        searchBoxClassName.get(8).click();
        exploreGotIt.click();
        okButton.click();
        sleep(4);
        setDestination.sendKeys("PeopleNTech, 32-72 Steinway St B02, Astoria,NY 11103", Keys.ENTER);
    }

    public void search() {
        MobileElement element = (MobileElement) searchBoxClassName.get(0);
        element.sendKeys(" Dhaka,Bangladesh");
        //Hit enter
        ad.tap(1,967,1841,1);
        ad.lockScreen(1);
    }

    public void clickGoButton() {
        burgerBtn.get(4).click();
        cancelButton.click();
        burgerBtn.get(3).click();
    }
}
