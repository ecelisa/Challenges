package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.HomePage;
import co.com.automatization.challenge1.userinterface.HomePageCrm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CreateTask implements Task {
    private String txtDate;
    private String txtSubject;
    private String txtDescription;
    private String txtStatus;
    private String txtPriority;

    public CreateTask(String txtDate, String txtSubject, String txtDescription, String txtStatus, String txtPriority) {
        this.txtDate = txtDate;
        this.txtSubject = txtSubject;
        this.txtDescription = txtDescription;
        this.txtStatus = txtStatus;
        this.txtPriority = txtPriority;
    }

    public static CreateTask create(String txtDate, String txtSubject, String txtDescription, String txtStatus, String txtPriority) {
        return Tasks.instrumented(CreateTask.class, txtDate, txtSubject, txtDescription, txtStatus, txtPriority);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageCrm.LINK_SUBMENU),
                Click.on(HomePageCrm.LINK_CREATE),
                Enter.theValue(txtSubject).into(HomePageCrm.INPUT_SUBJECT),
                Enter.theValue(txtDate).into(HomePageCrm.INPUT_DATE),
                SelectFromOptions.byVisibleText(txtStatus).from(HomePageCrm.SELECT_STATUS),
                SelectFromOptions.byVisibleText(txtPriority).from(HomePageCrm.SELECT_PRIORITY),
                Enter.theValue(txtDescription).into(HomePageCrm.TEXTAREA_DESCRIPTION),
                Click.on(HomePageCrm.BUTTON_SAVE)
        );
    }
}
