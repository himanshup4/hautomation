package amazonhelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BroswerInit {
    WebDriver driver;

    public WebDriver initializeDriver(String browser){
        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe"); // setup system environment variable for chrome driver
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\driver\\geckodriver.exe"); // setup system environment variable for firefox driver
            driver = new FirefoxDriver();
        }
        else if(browser.equals("IE")){
            System.setProperty("webdriver.ie.driver", "D:\\Selenium\\driver\\IEDriverServer.exe"); // setup system environment variable for firefox driver
            driver = new InternetExplorerDriver();
        }
        else{
            System.out.println("provide correct browser detail");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;

    }

}
