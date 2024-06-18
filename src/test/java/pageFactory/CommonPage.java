package pageFactory;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import utility.ClickTest;
import utility.DropdownTest;
import utility.TextboxTest;
import utility.WaitTest;

import java.util.List;

public class CommonPage {
    private String xPathButton1 = "//button[normalize-space(.)='";
    private String xPathButton2 = "']";

    private String xPathLink1 = "//a[normalize-space(.)='";
    private String xPathLink2 = "']";

    private String xPathField = "//*[normalize-space(.)='";
    private String xPathDropdown = "']/following-sibling::select";
    private String xPathTextbox = "']/following-sibling::input";

    public void clickButton(String buttonText){
        ClickTest clickTest = new ClickTest();
        WaitTest waitTest = new WaitTest();

        clickTest.clickElement(waitTest.wait10, By.xpath(xPathButton1 + buttonText + xPathButton2));

    }


    public void clickLink(String linkText){
        ClickTest clickTest = new ClickTest();
        WaitTest waitTest = new WaitTest();

        clickTest.clickElement(waitTest.wait10,By.xpath(xPathLink1 + linkText + xPathLink2));

    }

    public void enterDetailsInFields(String headerName, DataTable dataTableDetails){
        DropdownTest dropdownTest = new DropdownTest();
        TextboxTest textboxTest = new TextboxTest();
        WaitTest waitTest = new WaitTest();

        List<List<String>> listOfDetails = dataTableDetails.raw();
        for(List<String> listOfEachRow: listOfDetails) {
            switch (listOfEachRow.get(1)){
                case "Dropdown":
                    dropdownTest.selectDropdownOption(waitTest.wait10, By.xpath(xPathField + listOfEachRow.get(0) + xPathDropdown), listOfEachRow.get(2));
                    break;

                case "Textbox":
                    textboxTest.enterTextInTextbox(waitTest.wait10, By.xpath(xPathField + listOfEachRow.get(0) + xPathTextbox), listOfEachRow.get(2));
                    break;

            }
        }
    }
}
