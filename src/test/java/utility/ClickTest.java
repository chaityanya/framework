package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickTest extends  WaitTest{

    /**
     *
     * @param webDriverWait - wait time for the element to be clicked
     * @param locator - locator of the element to be clicked
     */
    public void clickElement(WebDriverWait webDriverWait, By locator){
        int iteratorCount = 0;
        while (iteratorCount<10){
            try{
                webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                WebElement webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
                webElement.click();
                break;
            } catch (Exception e){

            }
            iteratorCount++;
        }
    }



    public void clickElementByHoveringOtherElement(WebDriverWait webDriverWait, By hoveringLocator, By clickLocator){
        int iteratorCount = 0;
        while (iteratorCount<10){
            try{
                WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoveringLocator));
                Actions actions = new Actions(getDriver());
                actions.moveToElement(webElement).build().perform();
                Thread.sleep(2000);
                actions.click(webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(clickLocator))).build().perform();

                break;
            } catch (Exception e){

            }
            iteratorCount++;
        }
    }
}
