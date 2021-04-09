package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.BancolombiaSimuladorPage;
import co.com.automatization.challenge1.userinterface.ColorLibPage;
import co.com.automatization.challenge1.userinterface.ExitoPageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ColorLibPage colorLibPage;
    private BancolombiaSimuladorPage bancolombiaSimuladorPage;
    private ExitoPageHome exitoPageHome;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Open.browserOn(colorLibPage));
        //actor.attemptsTo(Open.browserOn(bancolombiaSimuladorPage));
        actor.attemptsTo(Open.browserOn(exitoPageHome));
    }
}
