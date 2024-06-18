package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.CommonPage;
import pageFactory.DashboardPage;
import utility.DriverTest;

public class DashboardStepDef {

    @Given("^User logs into the application as \"([^\"]*)\"$")
    public void user_logs_into_the_application_as(String arg1) throws Throwable {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.loginToApplication();
    }

    @Then("^User closes the browser$")
    public void user_closes_the_browser() throws Throwable {
        DriverTest driverTest = new DriverTest();
        driverTest.closeBrowser();
    }

    @When("^User opens new \"([^\"]*)\" case create screen$")
    public void user_opens_new_case_create_screen(String createType) throws Throwable {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.openCreateScreen(createType);
    }

    @Then("^User provides below \"([^\"]*)\" information$")
    public void user_provides_below_information(String headerName, DataTable dataTableFieldDetails) throws Throwable {
        CommonPage commonPage = new CommonPage();
        commonPage.enterDetailsInFields(headerName,dataTableFieldDetails);
    }

    @Then("^User \"([^\"]*)\" the \"([^\"]*)\" in \"([^\"]*)\" screen$")
    public void user_the_in_screen(String buttonText, String arg2, String arg3) throws Throwable {
        CommonPage commonPage = new CommonPage();
        commonPage.clickButton(buttonText);
    }
}
