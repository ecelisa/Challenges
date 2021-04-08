package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.FormPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormValidation implements Task {
    private String txtRequired;
    private String txtEmail;
    private String txtPass;
    private String txtConfirm;
    private String txtDate;
    private String txtUrl;
    private Integer txtDigits;
    private Integer txtRange;

    public FormValidation(String txtRequired, String txtEmail, String txtPass, String txtConfirm, String txtDate, String txtUrl, Integer txtDigits, Integer txtRange) {
        this.txtRequired = txtRequired;
        this.txtEmail = txtEmail;
        this.txtPass = txtPass;
        this.txtConfirm = txtConfirm;
        this.txtDate = txtDate;
        this.txtUrl = txtUrl;
        this.txtDigits = txtDigits;
        this.txtRange = txtRange;
    }

    public static FormValidation fill(String txtRequired, String txtEmail, String txtPass, String txtConfirm, String txtDate, String txtUrl, Integer txtDigits, Integer txtRange) {
        return Tasks.instrumented(FormValidation.class, txtRequired, txtEmail, txtPass, txtConfirm, txtDate, txtUrl, txtDigits, txtRange);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(txtRequired).into(FormPage.INPUT_REQUIRED),
                Enter.theValue(txtEmail).into(FormPage.INPUT_EMAIL),
                Enter.theValue(txtPass).into(FormPage.INPUT_PASS),
                Enter.theValue(txtConfirm).into(FormPage.INPUT_CONFIRM),
                Enter.theValue(txtDate).into(FormPage.INPUT_DATE),
                Enter.theValue(txtUrl).into(FormPage.INPUT_URL),
                Enter.theValue(String.valueOf(txtDigits)).into(FormPage.INPUT_DIGITS),
                Enter.theValue(String.valueOf(txtRange)).into(FormPage.INPUT_RANGE),
                Click.on(FormPage.CHECK_POLICY),
                Click.on(FormPage.BUTTON_VALIDATION)
        );
    }
}
