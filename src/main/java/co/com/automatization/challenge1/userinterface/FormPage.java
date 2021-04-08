package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target TITLE_FORM = Target.the("title of the form page").located(By.xpath("//h5[contains(text(), 'Block Validation')]"));
    public static final Target INPUT_REQUIRED = Target.the("element where do write the required").located(By.id("required2"));
    public static final Target INPUT_EMAIL = Target.the("element where do write the email").located(By.id("email2"));
    public static final Target INPUT_PASS = Target.the("element where do write the password").located(By.id("password2"));
    public static final Target INPUT_CONFIRM = Target.the("element where do write the confirm password").located(By.id("confirm_password2"));
    public static final Target INPUT_DATE = Target.the("element where do write the date").located(By.id("date2"));
    public static final Target INPUT_URL = Target.the("element where do write the url").located(By.id("url2"));
    public static final Target INPUT_DIGITS = Target.the("element where do write the digits").located(By.id("digits"));
    public static final Target INPUT_RANGE = Target.the("element where do write the range").located(By.id("range"));
    public static final Target CHECK_POLICY = Target.the("element where do accept the politics").located(By.id("agree2"));
    public static final Target BUTTON_VALIDATION = Target.the("button to validate form").located(By.xpath("//form[@id='block-validate']//input[contains(@class, 'btn btn-primary')]"));
}
