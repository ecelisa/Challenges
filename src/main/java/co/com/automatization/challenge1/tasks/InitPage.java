package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.SimulatedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InitPage implements Task {
    public static InitPage actions() {
        return Tasks.instrumented(InitPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SimulatedPage.BUTTON_CONTINUE),
                Click.on(SimulatedPage.CHECK_CONTINUE)
        );
    }
}
