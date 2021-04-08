package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String txtUser;
    private String txtPassword;

    public Login(String txtUser, String txtPassword) {
        this.txtUser = txtUser;
        this.txtPassword = txtPassword;
    }
    public static Login onThePage(String txtUser, String txtPassword) {
        return Tasks.instrumented(Login.class, txtUser, txtPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(txtUser).into(LoginPage.INPUT_USER),
                Enter.theValue(txtPassword).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
}
