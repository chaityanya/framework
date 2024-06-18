package pageFactory;

import org.openqa.selenium.By;
import utility.ClickTest;
import utility.DriverTest;
import utility.TextboxTest;
import utility.WaitTest;

public class DashboardPage {

    private String xPathTextboxPlaceHolder1 = "//*[@placeholder='";
    private String xPathTextboxPlaceHolder2 = "']";

    private String xPathCreate = "//*[normalize-space(text())='Create']/ancestor::button";
    private String xPathMentuItem1 = "//*[@role='menuitem']//*[normalize-space(text())='";
    private String xPathMentuItem2 = "']";



    public void enterValueInTextBoxWithPlaceHolder(String placeHolderText, String textToBeEnteredInTextbox){

        TextboxTest textboxTest = new TextboxTest();
        WaitTest waitTest = new WaitTest();

        textboxTest.enterTextInTextbox(waitTest.wait10, By.xpath(xPathTextboxPlaceHolder1 + placeHolderText + xPathTextboxPlaceHolder2), textToBeEnteredInTextbox);

    }


    public void loginToApplication() throws InterruptedException {
        DriverTest driverTest = new DriverTest();
        CommonPage commonPage = new CommonPage();
        WaitTest waitTest = new WaitTest();

        driverTest.openBrowser();
        enterValueInTextBoxWithPlaceHolder("User name","cscsr");
        enterValueInTextBoxWithPlaceHolder("Password","password123!");
        commonPage.clickButton("Log in");

        Thread.sleep(6000);
    }

    public void openCreateScreen(String createType){
        ClickTest clickTest = new ClickTest();
        WaitTest waitTest = new WaitTest();

        clickTest.clickElementByHoveringOtherElement(waitTest.wait10,By.xpath(xPathCreate),By.xpath(xPathMentuItem1 + "Interaction" + xPathMentuItem2));

    }



}
