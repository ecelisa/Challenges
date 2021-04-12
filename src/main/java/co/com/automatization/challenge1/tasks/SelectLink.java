package co.com.automatization.challenge1.tasks;

import co.com.automatization.challenge1.userinterface.YellowPageSearch;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectLink implements Task{
    public static SelectLink select() {
        return Tasks.instrumented(SelectLink.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> allProducts = YellowPageSearch.LIST_BANKS.resolveAllFor(actor);
        for (int i = 0; i < 10; i++){
            String url = allProducts.get(i).getText();
            //System.out.println("Texto: "+allProducts.get(i).getText());
            Target LINK_URL = Target.the("Open Url").locatedBy("//a[@href='"+url+"']");
            actor.attemptsTo(Click.on(LINK_URL));
        }
    }
}

