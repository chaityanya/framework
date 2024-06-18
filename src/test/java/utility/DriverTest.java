package utility;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverTest {

    private static WebDriver driver;

    public void openBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en-GB");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://pega.35a159b33c120.pegaenablement.com/prweb/");
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void closeBrowser(){
        driver.quit();
    }
}
