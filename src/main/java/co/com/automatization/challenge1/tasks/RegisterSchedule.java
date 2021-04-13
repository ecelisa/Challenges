package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.pslHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterSchedule implements Task {
    private String  txtDate;
    private String txtNumberDocumentPatient;
    private String txtNumberDocumentDoctor;
    private String txtDescription;

    public RegisterSchedule(String txtDate, String txtNumberDocumentPatient, String txtNumberDocumentDoctor, String getTxtDescription) {
        this.txtDate = txtDate;
        this.txtNumberDocumentPatient = txtNumberDocumentPatient;
        this.txtNumberDocumentDoctor = txtNumberDocumentDoctor;
        this.txtDescription = getTxtDescription;
    }

    public static RegisterSchedule registerInThePage(String txtDate, String txtNumberDocumentPatient, String txtNumberDocumentDoctor, String txtDescription) {
        return Tasks.instrumented(RegisterSchedule.class, txtDate, txtNumberDocumentPatient, txtNumberDocumentDoctor, txtDescription);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
            Click.on(pslHomePage.LINK_REGISTER_SCHEDULE),
            Enter.theValue(txtDate).into(pslHomePage.INPUT_DATE),
            Enter.theValue(txtNumberDocumentPatient).into(pslHomePage.INPUT_NUMBER_DOCUMENT_PATIENT_SCHEDULE),
            Enter.theValue(txtNumberDocumentDoctor).into(pslHomePage.INPUT_NUMBER_DOCUMENT_DOCTOR_SCHEDULE),
            Enter.theValue(txtDescription).into(pslHomePage.TEXTAREA_DESCRIPTION),
            Click.on(pslHomePage.BUTTON_SAVE)
        );
    }
}
