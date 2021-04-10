package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.model.ChallengeData;
import co.com.automatization.challenge1.model.Question;
import co.com.automatization.challenge1.questions.QuestionWelcome;
import co.com.automatization.challenge1.tasks.OpenUp;
import co.com.automatization.challenge1.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ChallengeStepDefinitions8 {
    @Given("^that david wants use the CRM Zoho$")
    public void thatDavidWantsUseTheCRMZoho() {
        OnStage.theActorCalled("David").wasAbleTo(OpenUp.thePage());
    }
    @When("^David made the successful registration$")
    public void davidMadeTheSuccessfulRegistration(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.registerInThePage(challengeData.get(0).getTxtName(), challengeData.get(0).getTxtEmail(), challengeData.get(0).getTxtPassword(), challengeData.get(0).getTxtDigits(), challengeData.get(0).getTxtCountryCode(), challengeData.get(0).getTxtCountry()));
    }
    @Then("^he checked the access in the platform$")
    public void heCheckedTheAccessInThePlatform(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(QuestionWelcome.toThe(challengeData.get(0).getTxtName())));
    }
}
