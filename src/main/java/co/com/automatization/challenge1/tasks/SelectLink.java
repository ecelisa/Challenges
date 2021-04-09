package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.HerokuPageAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectLink implements Task{
    public static SelectLink select() {
        return Tasks.instrumented(SelectLink.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HerokuPageAlert.LINK_REDIRECT)
        );
    }
}

