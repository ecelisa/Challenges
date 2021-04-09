package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.model.ChallengeData;
import co.com.automatization.challenge1.model.Question;
import co.com.automatization.challenge1.questions.Verify;
import co.com.automatization.challenge1.tasks.Login;
import co.com.automatization.challenge1.tasks.OpenUp;
import co.com.automatization.challenge1.tasks.Search;
import co.com.automatization.challenge1.tasks.SelectProduct;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ChallengeStepDefinitions4 {
    @Given("^that i want buy a tv for see futboll$")
    public void thatIWantBuyATvForSeeFutboll(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorCalled("me").wasAbleTo(OpenUp.thePage(), Search.searchOnThePage(challengeData.get(0).getTxtSearch()));
    }
    @When("^access the exito page and select the that more like me$")
    public void accessTheExitoPageAndSelectTheThatMoreLikeMe() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.select());
    }
    @Then("^i buy the TV for that arrive me at my house$")
    public void iBuyTheTVForThatArriveMeAtMyHouse() {
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.theTotal()));
    }
}
