package co.com.automatization.challenge1.questions;

import co.com.automatization.challenge1.model.ChallengeData;
import co.com.automatization.challenge1.userinterface.FormPage;
import co.com.automatization.challenge1.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String name = Text.of(HomePage.TITLE_HOME).viewedBy(actor).asString();
        if(question.equals(name)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
