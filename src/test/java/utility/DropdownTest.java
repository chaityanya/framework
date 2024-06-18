package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownTest {

    /**
     *
     * @param webDriverWait - wait time for the dropdown element
     * @param locator - locator of the dropdown element
     * @param dropdownOptionToBeSelected - value of dropdown to be selected
     */
    public void selectDropdownOption(WebDriverWait webDriverWait, By locator, String dropdownOptionToBeSelected){
        int iteratorCount = 0;
        while (iteratorCount<10){
            try{
                WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                Select select = new Select(webElement);
                select.selectByVisibleText(dropdownOptionToBeSelected);
                break;
            } catch (Exception e){

            }
            iteratorCount++;
        }
    }
}
