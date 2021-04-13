package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.pslHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterPatient implements Task {
    private String txtName;
    private String txtLastName;
    private String txtPhone;
    private String txtNumberDocument;
    private String txtDocumentType;

    public RegisterPatient(String txtName, String txtLastName, String txtPhone, String txtNumberDocument, String txtDocumentType) {
        this.txtName = txtName;
        this.txtLastName = txtLastName;
        this.txtPhone = txtPhone;
        this.txtNumberDocument = txtNumberDocument;
        this.txtDocumentType = txtDocumentType;
    }

    public static RegisterPatient registerInThePage(String txtName, String txtLastName, String txtPhone, String txtNumberDocument, String txtDocumentType) {
        return Tasks.instrumented(RegisterPatient.class, txtName, txtLastName, txtPhone, txtNumberDocument, txtDocumentType);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(pslHomePage.LINK_REGISTER_PATIENT),
                Enter.theValue(txtName).into(pslHomePage.INPUT_NAME_PATIENT),
                Enter.theValue(txtLastName).into(pslHomePage.INPUT_LASTNAME_PATIENT),
                Enter.theValue(txtPhone).into(pslHomePage.INPUT_PHONE_PATIENT),
                SelectFromOptions.byVisibleText(txtDocumentType).from(pslHomePage.SELECT_DOCUMENT_TYPE_PATIENT),
                Enter.theValue(txtNumberDocument).into(pslHomePage.INPUT_NUMBER_DOCUMENT_PATIENT),
                Click.on(pslHomePage.CHECK_PREPAGADA),
                Click.on(pslHomePage.BUTTON_SAVE)
        );
    }
}
