package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USER = Target.the("element where do write the user").located(By.xpath("//input[@placeholder='Username']"));
    public static final Target INPUT_PASSWORD = Target.the("element where do write the password").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BUTTON_LOGIN = Target.the("button of login").located(By.xpath("//button[contains(@class, 'btn btn-lg btn-primary btn-block')]"));
}
