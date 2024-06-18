package stepDefinition;



import cucumber.api.java.After;
import utility.DriverTest;

public class Hooks {

    @After
    public void tearDown(){
        DriverTest driverTest = new DriverTest();
        driverTest.closeBrowser();
    }

}
