package amazontest;

import amazonhelper.BroswerInit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonHome {
    public WebDriver driver;
    String url ="https://www.amazon.com";

    @BeforeClass
    public void initDriver(){
        BroswerInit ah = new BroswerInit();
        driver = ah.initializeDriver("chrome");
    }
    @Test
    public void verifyAmazonLaunch() {
      driver.get(url);
      String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle,expectedTitle);
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
