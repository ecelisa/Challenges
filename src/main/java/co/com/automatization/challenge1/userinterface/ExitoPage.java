package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExitoPage {
    public static final Target INPUT_SEARCH = Target.the("element where do write a word for search").located(By.id("downshift-0-input"));
    public static final Target BUTTON_SEARCH = Target.the("button for search").located(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/article[1]/ol[1]/li[1]/a[1]"));
    public static final Target CHECK_FILTER_1 = Target.the("elemento for select the firts filter").located(By.id("undefined-zlg"));
    public static final Target CHECK_FILTER_2 = Target.the("elemento for select the second filter").located(By.name("44 a 50 Pulgadas"));
    public static final Target BUTTON_SELECT_PRODUCT = Target.the("elemento for select the product").located(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/section[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/section[1]/a[1]"));
    public static final Target BUTTON_ADD_BUY = Target.the("elemento for select the firts filter").located(By.xpath("//div[contains(@class, 'productSummaryBuyButtonProductDetail')]//button"));
    public static final Target BUTTON_SHOPPING_CART = Target.the("elemento for select the firts filter").located(By.xpath("//a[contains(@class, 'exito-header7-x-minicartButton')]"));
    public static final Target LABEL_SUBTOTAL = Target.the("elemento for select the firts filter").located(By.xpath("//td[@class='monetary exito-checkout-monetary')]"));
}
