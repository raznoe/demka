package supportFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import supportMethods.SauceLabsStack;
import testRunner.TestRunner;

public class WebdriverFactory {
//    private static class BrowserCleanup implements Runnable {
//        public void run() {
//            System.out.println("Cleaning up the browser");
//            try {
//                Driver.webdriver.quit();
//            } catch (NullPointerException e) {
//                System.out.println("Browser already shut down.");
//            }
//        }
//    }


    public static WebDriver createWebdriver() {
        caps = new DesiredCapabilities();
        String seleniumEnvironment = TestRunner.config.get("seleniumEnvironment");

        if (seleniumEnvironment.equals("local")) {
           // Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            return BrowserFactory.selectLocalBrowser();

        } else {
            if (seleniumEnvironment.equals("saucelabs")) {
                caps.merge(SauceLabsStack.setBrowserCapabilities());
                caps.merge(SauceLabsStack.setProjectDetails());
                SauceLabsStack.setSeleniumHub();
            }
            PlatformFactory.selectPlatform(caps);
            BrowserFactory.selectBrowser(caps);
            WebdriverFactory.caps.merge(additionalCapabilities);

            String seleniumHub = TestRunner.config.get("seleniumHub");

//            try {
//                return new RemoteWebDriver(new URL(seleniumHub), caps);
//            } catch (WebDriverException e) {
//                Driver.writeToReport("WebDriverException: " + e.getMessage());
//                Assert.fail(e.getMessage());
//            }
//            catch (Exception e) {
//                Driver.writeToReport(e.getMessage());
//            }
//            finally {
//                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
//            }
        }
        return null;
    }

    public static DesiredCapabilities caps;
    public static DesiredCapabilities additionalCapabilities = new DesiredCapabilities();

}
