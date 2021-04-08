package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.model.Question;
import co.com.automatization.challenge1.tasks.FormSimulated;
import co.com.automatization.challenge1.tasks.InitPage;
import co.com.automatization.challenge1.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class ChallengeStepDefinitions2 {
    @Given("^that alex wants a simulation the quota of a credit$")
    public void thatAlexWantsASimulationTheQuotaOfACredit() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thePage(), InitPage.actions());
    }
    @When("^he fill the form for simulated with (\\d+) and (\\d+) quota$")
    public void heFillTheFormForSimulatedWithAndQuotaAndBirthDate(Integer amount, Integer quota) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormSimulated.fill(amount, quota));
    }
    @Then("^he see a payment list$")
    public void heSeeAPaymentList() {
    }
}
