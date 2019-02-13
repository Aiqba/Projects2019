package stepdefinitios;

import cucumber.api.java.en.Given;
import org.testng.Assert;

public class DocStringDemo {
    @Given("^a blog post named \"([^\"]*)\" with Markdown body$")
    public void a_blog_post_named_with_Markdown_body(String arg1, String arg2) throws Throwable {

        arg1 = "I am doing well";
        System.out.println("Argument2:" + arg2);

        Assert.assertEquals(arg2,"Hello Dear");
    }

    }
