package appModule;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import pageObjects.HomePage;
import tests.Config;
import webDriver.Driver;

public class GoogleSearch_Action extends Config{


    static WebDriver driver = Driver.getCurrentDriver();

    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void search(String searchCriteria) {

//        String baseurl = "https://www.google.com";
        driver.get(baseUrl);
        wait.until(ExpectedConditions.elementToBeClickable(HomePage.searchField()));

        HomePage.searchField().clear();
        HomePage.searchField().sendKeys(searchCriteria);
        HomePage.searchField().sendKeys(Keys.RETURN);

        wait.until(ExpectedConditions.titleContains("Google Search"));
    }
}
