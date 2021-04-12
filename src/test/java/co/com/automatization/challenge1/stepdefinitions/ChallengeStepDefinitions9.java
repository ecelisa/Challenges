package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.tasks.OpenUp;
import co.com.automatization.challenge1.tasks.Search;
import co.com.automatization.challenge1.tasks.SelectLink;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ChallengeStepDefinitions9 {
    @Given("^that Mateo want search banks$")
    public void thatMateoWantSearchBanks() {
        OnStage.theActorCalled("Mateo").wasAbleTo(OpenUp.thePage(), Search.searchOnThePage("Bancos"));
    }
    @When("^Mateo select the banks$")
    public void mateoSelectTheBanks() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectLink.select());
    }
    @Then("^he checked the page of the banks$")
    public void heCheckedThePageOfTheBanks() {
    }
}
