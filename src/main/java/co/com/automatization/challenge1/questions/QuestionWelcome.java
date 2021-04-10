package co.com.automatization.challenge1.questions;

import co.com.automatization.challenge1.userinterface.HomePage;
import co.com.automatization.challenge1.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QuestionWelcome implements Question<Boolean> {
    private String txtName;

    public QuestionWelcome(String txtName) {
        this.txtName = txtName;
    }

    public static QuestionWelcome toThe(String txtName) {
        return new QuestionWelcome(txtName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcome = Text.of(RegisterPage.LABEL_WELCOME).viewedBy(actor).asString();
        if(txtName.equals(welcome)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
