package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ColorLibPage colorLibPage;
    private BancolombiaSimuladorPage bancolombiaSimuladorPage;
    private ExitoPageHome exitoPageHome;
    private HerokuPage herokuPage;
    private CrmZohoPage crmZohoPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Open.browserOn(colorLibPage));
        //actor.attemptsTo(Open.browserOn(bancolombiaSimuladorPage));
        //actor.attemptsTo(Open.browserOn(exitoPageHome));
        //actor.attemptsTo(Open.browserOn(herokuPage));
        actor.attemptsTo(Open.browserOn(crmZohoPage));
    }
}
