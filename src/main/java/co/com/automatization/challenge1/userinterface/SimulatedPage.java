package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulatedPage {
    public static final Target BUTTON_CONTINUE = Target.the("button for continue of the process").located(By.id("boton-seleccion-tarjeta"));
    public static final Target CHECK_CONTINUE = Target.the("chec for continue of the process").located(By.xpath("//div[@class='mat-radio-label-content']"));
    public static final Target TXT_AMOUNT = Target.the("element where do write a amount").located(By.id("valor-simulacion"));
    public static final Target TXT_BIRTHDATE = Target.the("element where do write a birthdate").located(By.id("campo-fecha"));
    public static final Target TXT_QUOTA = Target.the("element where do write the quotas").located(By.id("valor-plazo"));
    public static final Target BUTTON_SIMULATED = Target.the("button for simulated").located(By.id("boton-simular"));
    public static final Target LINK_YEAR = Target.the("link for select years").located(By.xpath("//td[@aria-label='1982']"));
    public static final Target LINK_MONTH = Target.the("link for select months").located(By.xpath("//td[@aria-label='abril de 1982']"));
    public static final Target LINK_DAY = Target.the("link for select days").located(By.xpath("//td[@aria-label='15 de abril de 1982']"));
}
