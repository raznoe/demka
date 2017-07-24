package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webDriver.Driver;

import static org.openqa.selenium.By.id;
import static pageObjects.Common.present;

public class ExpediaHomePage {

//    @FindBy(id = "header-logo")
//    private static WebElement logoImage;

    @FindBy(id = "tab-flight-tab")
    private WebElement flightButton;


    public static void flightButtonClick(){
        flightButton().click();

    }


    static By logoImage = By.id("header-logo");

    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement searchField() {
        return driver.findElement(id("hotel-destination"));
    }

//    public static WebElement logoImage() {
//       return driver.findElement(By.id("header-logo"));
//    }

    public static WebElement flightButton() {
        return driver.findElement(id("tab-flight-tab"));
    }

    public static WebElement flightOrigin() {
        return driver.findElement(id("flight-origin"));
    }

    public static void logoImagePresent() {
//        present(By.id("header-logo"), 10);
        present(logoImage, 10);
    }

    public static WebElement flightDestination() {
        return driver.findElement(id("flight-destination"));
    }

    public static WebElement flightDepartingDate() {
        return driver.findElement(id("flight-departing"));
    }

    public static WebElement flightReturningDate() {
        return driver.findElement(id("flight-returning"));
    }

    public static void searchButtonClick() {
         driver.findElement(id("search-button")).click();
    }



}
