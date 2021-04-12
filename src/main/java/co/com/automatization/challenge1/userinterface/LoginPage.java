package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USER = Target.the("element where do write the email").located(By.id("login_id"));
    public static final Target INPUT_PASSWORD = Target.the("element where do write the password").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("button of login").located(By.id("nextbtn"));
    public static final Target LINK_LOGIN = Target.the("link for open the login").located(By.className("zgh-login"));
}
