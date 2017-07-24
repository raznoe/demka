package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class ExpediaResultPage {
    static WebDriver driver = Driver.getCurrentDriver();

        public static WebElement getResultsPage() {


            return driver.findElement(By.id("flightSearchResultDiv"));
        }
    }
