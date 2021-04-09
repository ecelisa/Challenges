package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.model.ChallengeData;
import co.com.automatization.challenge1.tasks.OpenUp;
import co.com.automatization.challenge1.tasks.SelectLink;
import co.com.automatization.challenge1.tasks.UseUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class ChallengeStepDefinitions7 {
    @Given("^that Mary access at the heroku page$")
    public void thatMaryAccessAtTheHerokuPage() {
        OnStage.theActorCalled("Mary").wasAbleTo(OpenUp.thePage());
    }
    @When("^she select the link javascript alerts$")
    public void sheSelectTheLinkJavascriptAlerts() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectLink.select());
    }
    @When("^she interact with the controls that exits in the page$")
    public void sheInteractWithTheControlsThatExitsInThePage(List<ChallengeData> challengeData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(UseUtils.use(challengeData.get(0).getTxtMessage()));
    }
    @Then("^she learns to use the JavaScript Alerts$")
    public void sheLearnsToUseTheJavaScriptAlerts(List<ChallengeData> challengeData) {

    }
}
