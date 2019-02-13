package test.page.objects;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.soap.Text;

public class NaveSearchTest {

    NaveSearchTest objOfNavsearch = null;

    @Test
    public void setObjOfNavsearch(){

        String actualText = objOfNavsearch.seaerch();
        Assert.assertEquals(actualText, "Sale");

        System.out.println("Search Test");

    }

    private String seaerch() {
        String actualText = objOfNavsearch.seaerch();
        Assert.assertEquals(actualText, "Men");
        System.out.println("search Test");
        return seaerch();



    }

}
