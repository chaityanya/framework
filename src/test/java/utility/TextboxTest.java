package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextboxTest {

    /**
     *
     * @param webDriverWait - wait time for the Textbox element
     * @param locator - locator of the Textbox element
     * @param textToBeEnteredInTextbox - value of dropdown to be selected
     */
    public void enterTextInTextbox(WebDriverWait webDriverWait, By locator, String textToBeEnteredInTextbox){
        int iteratorCount = 0;
        while (iteratorCount<10){
            try{
                WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                webElement.clear();
                webElement.sendKeys(textToBeEnteredInTextbox);
                break;
            } catch (Exception e){

            }
            iteratorCount++;
        }
    }
}
