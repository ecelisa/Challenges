package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.ExitoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProduct implements Task {
    public static SelectProduct select() {
        return Tasks.instrumented(SelectProduct.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ExitoPage.CHECK_FILTER_1),
                Click.on(ExitoPage.CHECK_FILTER_2)
                //Click.on(ExitoPage.BUTTON_SELECT_PRODUCT)
                //Click.on(ExitoPage.BUTTON_ADD_BUY),
                //Click.on(ExitoPage.BUTTON_SHOPPING_CART)
        );
    }
}
