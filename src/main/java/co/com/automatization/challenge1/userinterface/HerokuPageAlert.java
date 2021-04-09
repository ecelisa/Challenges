package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HerokuPageAlert {
    public static final Target LINK_REDIRECT = Target.the("link for redirect").located(By.xpath("//a[text()='JavaScript Alerts']"));
}
