package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {
    public static final Target INPUT_NAME = Target.the("element where you can write a name").located(By.id("namefield"));
    public static final Target INPUT_EMAIL = Target.the("element where you can write a email").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("element where you can write a name").located(By.name("password"));
    public static final Target SELECT_COUNTRY_CODE = Target.the("element where you can write a name").located(By.id("country_code"));
    public static final Target INPUT_PHONE = Target.the("element where you can write a name").located(By.id("mobile"));
    public static final Target LINK_CHANGE_COUNTRY = Target.the("element where you can write a name").located(By.id("zip-countryname-change"));
    public static final Target SELECT_COUNTRY = Target.the("element where you can write a name").located(By.id("country"));
    public static final Target CHECK_POLITICS = Target.the("element where you can write a name").located(By.id("signup-termservice"));
    public static final Target BUTTON_REGISTER = Target.the("element where you can write a name").located(By.id("signupbtn"));
    public static final Target LABEL_WELCOME = Target.the("message of weolcome").located(By.id("headerUName"));

}
