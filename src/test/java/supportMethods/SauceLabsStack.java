package supportMethods;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import testRunner.TestRunner;


public class SauceLabsStack {
    public static Boolean useSauceLabsStack() {

        return Boolean.valueOf(TestRunner.config.get("useSauceLabsStack"));
    }

    public static void setSeleniumHub() {

        String sauceLabsUsername = TestRunner.config.get("sauceLabsUsername");

        if (sauceLabsUsername == null) {
            throw new WebDriverException("Sauce Labs username not set.");
        }

        String sauceLabsPassword = TestRunner.config.get("sauceLabsPassword");

        if (sauceLabsPassword == null) {
            throw new WebDriverException("Sauce Labs password not set.");
        }

        TestRunner.config.put("seleniumHub", "http://" + sauceLabsUsername + ":" + sauceLabsPassword + "@hub.saucelabs.com/wd/hub");
    }

    public static DesiredCapabilities setBrowserCapabilities() {

        DesiredCapabilities caps = new DesiredCapabilities();

//        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("resolution", TestRunner.config.get("browserstackResolution"));

        return caps;
    }

    public static DesiredCapabilities setProjectDetails() {

        String project = TestRunner.config.get("sauceLabsProject");
        String build = TestRunner.config.get("browserstackBuild");

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("project", project);
        caps.setCapability("build", build);

        return caps;
    }

}
