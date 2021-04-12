package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.YellowPageSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String word;
    public Search(String word) {
        this.word = word;
    }
    public static Search searchOnThePage(String word){
        return Tasks.instrumented(Search.class, word);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(word).into(YellowPageSearch.INPUT_SEARCH),
                Click.on(YellowPageSearch.BUTTON_SEARCH)
        );
    }
}
