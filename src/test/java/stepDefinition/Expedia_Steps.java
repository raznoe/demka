package stepDefinition;

import appModule.Expedia_Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ExpediaHomePage;

import static pageObjects.Common.visit;
import static tests.Config.expedia_baseUrl;

public class Expedia_Steps{

    @Given("^User is on expedia homepage$")
    public void userIsOnExpediaHomepage() throws Throwable {
        visit(expedia_baseUrl);
        ExpediaHomePage.logoImagePresent();
    }


    @When("^User searches for flight from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userSearchesForFlightFromTo(String flightOrigin, String flightDestination) throws Throwable {
        Expedia_Action.searchForFlight(flightOrigin, flightDestination);
    }

    @Then("^User presented with flight results$")
    public void userPresentedWithFlightOption() throws Throwable {
        Expedia_Action.resultsCheck();
    }


}
