package appModule;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ExpediaHomePage;
import pageObjects.ExpediaResultPage;
import tests.Config;
import webDriver.Driver;

public class Expedia_Action extends Config {


    static WebDriver driver = Driver.getCurrentDriver();

    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void searchForFlight(String flightOrigin, String flightDestination) throws InterruptedException {
        driver.get(expedia_baseUrl);

        wait.until(ExpectedConditions.elementToBeClickable(ExpediaHomePage.searchField()));

        //ExpediaHomePage.flightButton().click();
        ExpediaHomePage.flightButtonClick();
        ExpediaHomePage.flightOrigin().clear();
        ExpediaHomePage.flightOrigin().sendKeys(flightOrigin);
        ExpediaHomePage.flightDestination().clear();
        ExpediaHomePage.flightDestination().sendKeys(flightDestination);
        ExpediaHomePage.flightDepartingDate().sendKeys("19/05/2017");
        ExpediaHomePage.flightReturningDate().sendKeys("25/05/2017");

        ExpediaHomePage.searchButtonClick();

        ExpediaHomePage.flightButton().click();
        ExpediaHomePage.flightOrigin().clear();
        ExpediaHomePage.flightOrigin().sendKeys(flightOrigin);
        ExpediaHomePage.flightDestination().clear();
        ExpediaHomePage.flightDestination().sendKeys(flightDestination);
        ExpediaHomePage.flightDepartingDate().sendKeys("19/05/2017");
        ExpediaHomePage.flightReturningDate().sendKeys("25/05/2017");
        ExpediaHomePage.searchButtonClick();
    }


    public static void resultsCheck() {
        wait.until(ExpectedConditions.elementToBeClickable(ExpediaResultPage.getResultsPage()));
    }
}
