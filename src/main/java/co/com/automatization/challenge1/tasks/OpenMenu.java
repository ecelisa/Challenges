package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenMenu implements Task {
    public static OpenMenu surf() {
        return Tasks.instrumented(OpenMenu.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LINK_FORM),
                Click.on(HomePage.LINK_FORM_VALIDATION)
        );
    }
}
