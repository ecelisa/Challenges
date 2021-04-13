package co.com.automatization.challenge1.stepdefinitions;

import co.com.automatization.challenge1.model.ChallengeData;
import co.com.automatization.challenge1.questions.Answer;
import co.com.automatization.challenge1.tasks.OpenUp;
import co.com.automatization.challenge1.tasks.RegisterDoctor;
import co.com.automatization.challenge1.tasks.RegisterPatient;
import co.com.automatization.challenge1.tasks.RegisterSchedule;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ChallengeStepDefinitions10 {
    @Given("^that Carlos want make a request a medical appointment$")
    public void thatCarlosWantMakeARequestAMedicalAppointment() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^Carlos fill the form for register a doctor$")
    public void carlosFillTheFormForRegisterADoctor(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterDoctor.registerInThePage(challengeData.get(0).getTxtName(),challengeData.get(0).getTxtLastName(),challengeData.get(0).getTxtPhone(),challengeData.get(0).getTxtNumberDocumentDoctor(),challengeData.get(0).getTxtDocumentType()));
    }

    @Then("^carlos verify that the register of the doctor is saved$")
    public void carlosVerifyThatTheRegisterOfTheDoctorIsSaved(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(challengeData.get(0).getTxtMessage())));
    }

    @When("^Carlos fill the form for register a patient$")
    public void carlosFillTheFormForRegisterAPatient(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPatient.registerInThePage(challengeData.get(0).getTxtName(),challengeData.get(0).getTxtLastName(),challengeData.get(0).getTxtPhone(),challengeData.get(0).getTxtNumberDocumentPatient(),challengeData.get(0).getTxtDocumentType()));
    }

    @Then("^carlos verify that the register of the patient is saved$")
    public void carlosVerifyThatTheRegisterOfThePatientIsSaved(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(challengeData.get(0).getTxtMessage())));
    }

    @When("^Carlos fill the form for schedule a medical appointment$")
    public void carlosFillTheFormForScheduleAMedicalAppointment(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSchedule.registerInThePage(challengeData.get(0).getTxtDate(),challengeData.get(0).getTxtNumberDocumentPatient(),challengeData.get(0).getTxtNumberDocumentDoctor(),challengeData.get(0).getTxtDescription()));
    }

    @Then("^carlos verify that the register of the schedule is saved$")
    public void carlosVerifyThatTheRegisterOfTheScheduleIsSaved(List<ChallengeData> challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(challengeData.get(0).getTxtMessage())));
    }

}
