package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTest extends  DriverTest{

    public WebDriverWait wait10 = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

}
