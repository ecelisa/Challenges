package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://the-internet.herokuapp.com/")
public class HerokuPage extends PageObject {
    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    public WebElementFacade buttonAlert;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    public WebElementFacade buttonConfirm;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElementFacade buttonPrompt;

    public void goButtonAcceptAlert(){
        buttonAlert.click();
        getDriver().switchTo().alert().accept();
    }
    public void goConfirmAlert(){
        buttonConfirm.click();
        getDriver().switchTo().alert().dismiss();
    }
    public void insertTextIntoAlert(String txtMessage){
        buttonPrompt.click();
        getDriver().switchTo().alert().sendKeys(txtMessage);
        getDriver().switchTo().alert().accept();
    }
}
