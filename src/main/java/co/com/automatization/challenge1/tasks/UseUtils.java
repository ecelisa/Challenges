package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.HerokuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Alert;

public class UseUtils implements Task {

    private String txtMessage;

    public UseUtils(String txtMessage) {
        this.txtMessage = txtMessage;
    }

    public static UseUtils use(String txtMessage) {
        return Tasks.instrumented(UseUtils.class, txtMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}
