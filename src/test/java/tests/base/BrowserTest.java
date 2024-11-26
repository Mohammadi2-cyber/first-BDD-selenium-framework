package tests.base;

import base.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }

}
