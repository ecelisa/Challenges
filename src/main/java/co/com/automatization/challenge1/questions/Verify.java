package co.com.automatization.challenge1.questions;

import co.com.automatization.challenge1.userinterface.ExitoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verify implements Question<Boolean> {
    public static Verify theTotal(){
        return new Verify();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String total = Text.of(ExitoPage.LABEL_SUBTOTAL).viewedBy(actor).asString();
        if(total.equals(0)) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
