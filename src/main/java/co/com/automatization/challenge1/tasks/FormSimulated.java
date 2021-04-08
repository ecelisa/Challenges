package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.SimulatedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormSimulated implements Task {
    private Integer amount;
    private Integer quota;

    public FormSimulated(Integer amount, Integer quota) {
        this.amount = amount;
        this.quota = quota;
    }

    public static FormSimulated fill(Integer amount, Integer quota) {
        return Tasks.instrumented(FormSimulated.class, amount, quota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(amount)).into(SimulatedPage.TXT_AMOUNT),
                Click.on(SimulatedPage.TXT_BIRTHDATE),
                Click.on(SimulatedPage.LINK_YEAR),
                Click.on(SimulatedPage.LINK_MONTH),
                Click.on(SimulatedPage.LINK_DAY),
                Enter.theValue(String.valueOf(quota)).into(SimulatedPage.TXT_QUOTA),
                Click.on(SimulatedPage.BUTTON_SIMULATED)
        );
    }
}
