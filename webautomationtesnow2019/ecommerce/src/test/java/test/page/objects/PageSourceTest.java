package test.page.objects;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.PageSource;

public class PageSourceTest {

    PageSource objectPageSource = null;

 @Test
public void searchSource() {

     String actualText = objectPageSource.search();
     Assert.assertEquals(actualText, "view-source");
     System.out.println("search Test");


 }
}
