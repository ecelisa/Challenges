package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private String txtName;
    private String txtEmail;
    private String txtPassword;
    private Integer txtDigits;
    private String txtCountryCode;
    private String txtCountry;

    public Register(String txtName, String txtEmail, String txtPassword, Integer txtDigits, String txtCountryCode, String txtCountry) {
        this.txtName = txtName;
        this.txtEmail = txtEmail;
        this.txtPassword = txtPassword;
        this.txtDigits = txtDigits;
        this.txtCountryCode = txtCountryCode;
        this.txtCountry = txtCountry;
    }

    public static Register registerInThePage(String txtName, String txtEmail, String txtPassword, Integer txtDigits, String txtCountryCode, String txtCountry) {
        return Tasks.instrumented(Register.class, txtName, txtEmail, txtPassword, txtDigits, txtCountryCode, txtCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(txtName).into(RegisterPage.INPUT_NAME),
            Enter.theValue(txtEmail).into(RegisterPage.INPUT_EMAIL),
            Enter.theValue(txtPassword).into(RegisterPage.INPUT_PASSWORD),
            SelectFromOptions.byVisibleText(txtCountryCode).from(RegisterPage.SELECT_COUNTRY_CODE),
            Enter.theValue(String.valueOf(txtDigits)).into(RegisterPage.INPUT_PHONE),
            Click.on(RegisterPage.LINK_CHANGE_COUNTRY),
            SelectFromOptions.byVisibleText(txtCountry).from(RegisterPage.SELECT_COUNTRY),
            Click.on(RegisterPage.CHECK_POLITICS),
            Click.on(RegisterPage.BUTTON_REGISTER)
        );
    }
}
