package co.com.automatization.challenge1.model;
import co.com.automatization.challenge1.userinterface.FormPage;
import co.com.automatization.challenge1.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;

public class Question implements net.serenitybdd.screenplay.Question<Boolean> {
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public static Question toThe(String question) {
        return new Question(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String name = Text.of(FormPage.TITLE_FORM).viewedBy(actor).asString();
        if(question.equals(name)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
