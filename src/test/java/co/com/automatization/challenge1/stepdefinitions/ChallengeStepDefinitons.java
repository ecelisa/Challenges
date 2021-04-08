package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.model.ChallengeData;
import co.com.automatization.challenge1.model.Question;
import co.com.automatization.challenge1.questions.Answer;
import co.com.automatization.challenge1.tasks.FormValidation;
import co.com.automatization.challenge1.tasks.Login;
import co.com.automatization.challenge1.tasks.OpenMenu;
import co.com.automatization.challenge1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChallengeStepDefinitons {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Maria wants to learn more the color library, she login$")
    public void thanMariaWantsToLearnMoreTheColorLibrarySheLogin(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorCalled("Maria").wasAbleTo(OpenUp.thePage(), Login.onThePage(challengeData.get(0).getTxtUser(), challengeData.get(0).getTxtPassword()));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(challengeData.get(0).getTitleHome())));
    }
    @When("^she surf for menu and find the section block validate and fill the form for see its funcionality$")
    public void sheSurfForMenuAndFindTheSectionBlockValidateAndFillTheFormForSeeItsFuncionality(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenMenu.surf(), FormValidation.fill(
                challengeData.get(0).getTxtRequired(),
                challengeData.get(0).getTxtEmail(),
                challengeData.get(0).getTxtPass(),
                challengeData.get(0).getTxtConfirm(),
                challengeData.get(0).getTxtDate(),
                challengeData.get(0).getTxtUrl(),
                challengeData.get(0).getTxtDigits(),
                challengeData.get(0).getTxtRange()
        ));
    }
    @Then("^she sees the menssage of validation$")
    public void sheSeesTheMenssageOfValidation(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Question.toThe(challengeData.get(0).getTitleForm())));
    }
}
