package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.Driver;

public class Common {
    static WebDriver driver = Driver.getCurrentDriver();


    public static void visit(String url) {
        driver.get(url);

    }

    public static WebElement find(WebElement locator) {
        return locator;
    }

    public static boolean isDisplayed(WebElement locator, int i) {
        try {
            return find(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException exception) {
            return false;
        }
    }

    public static void click(WebElement locator) {
        find(locator).click();
    }

    public static void type(String inputText, WebElement locator) {
        find(locator).sendKeys(inputText);
    }

    public static boolean present(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
//            WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
             wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
        } catch (org.openqa.selenium.TimeoutException exception) {
            return false;
        }
        return true;
    }
}
