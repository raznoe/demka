package supportFactory;

import enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import testRunner.TestRunner;


public class BrowserFactory {


    static Browser browser = Browser.valueOf(TestRunner.config.get("browser"));

    static String desiredBrowserVersion = TestRunner.config.get("browserVersion");

    public static DesiredCapabilities selectBrowser(DesiredCapabilities caps) {

        switch (browser) {
            case Chrome:
                caps.setCapability("browserName", "chrome");
                break;
            case Firefox:
                caps.setCapability("browserName", "firefox");
                break;
            default:
                throw new WebDriverException("No browser specified");
        }
        caps.setCapability("version", desiredBrowserVersion);
        return caps;
    }

    public static WebDriver selectLocalBrowser() {
        switch (browser) {
            case Chrome:
//                System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/vendor/chromedriver");

                return new ChromeDriver();
            case Firefox:
                System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir") + "/vendor/geckodriver");
                return new FirefoxDriver();
            case IE:
                return new InternetExplorerDriver();
            case Safari:
                return new SafariDriver();
            default:
                throw new WebDriverException("No browser specified");
        }
    }
}
