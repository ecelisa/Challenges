package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target TITLE_HOME = Target.the("title of the home page").located(By.id("bootstrap-admin-template"));
    public static final Target LINK_FORM = Target.the("Link to forms").located(By.xpath("//a[contains(text(), 'Form Elements')]"));
    public static final Target LINK_FORM_VALIDATION = Target.the("Link to forms validation").located(By.xpath("//a[contains(text(), 'Validation')]"));
}