package webDriver;


import org.openqa.selenium.WebDriver;
import supportFactory.WebdriverFactory;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver webdriver;

    public static WebDriver getCurrentDriver() {

        if (webdriver == null) {
            webdriver = WebdriverFactory.createWebdriver();
            webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webdriver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        }
        return webdriver;
    }



    public static void kill(){
        if (webdriver != null){
            webdriver.quit();
            webdriver = null;
        }

    }

}
