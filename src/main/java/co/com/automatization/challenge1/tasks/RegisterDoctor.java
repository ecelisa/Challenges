package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.pslHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterDoctor implements Task {
    private String txtName;
    private String txtLastName;
    private String txtPhone;
    private String txtNumberDocument;
    private String txtDocumentType;

    public RegisterDoctor(String txtName, String txtLastName, String txtPhone, String txtNumberDocument, String txtDocumentType) {
        this.txtName = txtName;
        this.txtLastName = txtLastName;
        this.txtPhone = txtPhone;
        this.txtNumberDocument = txtNumberDocument;
        this.txtDocumentType = txtDocumentType;
    }

    public static RegisterDoctor registerInThePage(String txtName, String txtLastName, String txtPhone, String txtNumberDocument, String txtDocumentType) {
        return Tasks.instrumented(RegisterDoctor.class, txtName, txtLastName, txtPhone, txtNumberDocument, txtDocumentType);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(pslHomePage.LINK_REGISTER_DOCTOR),
                Enter.theValue(txtName).into(pslHomePage.INPUT_NAME),
                Enter.theValue(txtLastName).into(pslHomePage.INPUT_LASTNAME),
                Enter.theValue(txtPhone).into(pslHomePage.INPUT_PHONE),
                SelectFromOptions.byVisibleText(txtDocumentType).from(pslHomePage.SELECT_DOCUMENT_TYPE),
                Enter.theValue(txtNumberDocument).into(pslHomePage.INPUT_NUMBER_DOCUMENT),
                Click.on(pslHomePage.BUTTON_SAVE)
        );
    }
}
