package co.com.automatization.challenge1.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class YellowPageSearch {
    public static final Target INPUT_SEARCH = Target.the("element where do write a keyword for search").located(By.id("keyword"));
    public static final Target BUTTON_SEARCH = Target.the("butoton for search").located(By.id("buscar"));
    public static final Target LIST_BANKS = Target.the("List of the banks").locatedBy("//div[@class='row listingWrap margin-off']/div//div[@class='url']/a");
}
