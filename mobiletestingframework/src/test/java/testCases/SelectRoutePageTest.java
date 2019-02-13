package testCases;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import route.SelectRoutePage;

public class SelectRoutePageTest extends SelectRoutePage {

    HomePage objHomePage;
    SelectRoutePage objSelectRoutePage;

    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
        objSelectRoutePage = PageFactory.initElements(ad, SelectRoutePage.class);
    }

    @Test
    public void testSelectRoute(){
        objHomePage.clickGoButton();
        objSelectRoutePage.selectRoute();
    }
}
