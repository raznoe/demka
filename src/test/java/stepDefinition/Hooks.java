package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import supportMethods.FileRead;
import testRunner.TestRunner;
import webDriver.Driver;

import java.io.IOException;

public class Hooks {
    public static WebDriver driver;
    private static Boolean runOnce = false;



//    @Before
//    public void beforeAll() throws FileNotFoundException, IOException, InterruptedException {
//        if (!runOnce) {
//            TestRunner.config = FileRead.readProperties();
//        }
//    }

    @Before
    public void before(Scenario scenario) throws IOException {
        TestRunner.scenario = scenario;
        TestRunner.config = FileRead.readProperties();

    }

    @After
    public void after(Scenario scenario)
    {
       Driver.kill();
    }
}
