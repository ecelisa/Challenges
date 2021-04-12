package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageCrm {
    public static final Target LINK_SUBMENU = Target.the("link for open the submenu").located(By.id("createIcon"));
    public static final Target LINK_CREATE = Target.the("link of redirection to create form").located(By.id("submenu_Tasks"));
    public static final Target INPUT_SUBJECT = Target.the("element where do write a subject").located(By.id("Crm_Tasks_SUBJECT"));
    public static final Target INPUT_DATE = Target.the("element where do write a date").located(By.id("Crm_Tasks_DUEDATE"));
    public static final Target SELECT_STATUS = Target.the("element where do select a status").located(By.id("Crm_Tasks_STATUS"));
    public static final Target SELECT_PRIORITY = Target.the("element where do write a subject").located(By.id("Crm_Tasks_PRIORITY"));
    public static final Target TEXTAREA_DESCRIPTION = Target.the("element where do write a subject").located(By.id("Crm_Tasks_DESCRIPTION"));
    public static final Target BUTTON_SAVE = Target.the("element where do write a subject").located(By.id("saveTasksBtn"));
    public static final Target TITLE_RESUME = Target.the("title for verify the create").located(By.id("subvalue_SUBJECT"));
}
