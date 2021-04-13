package co.com.automatization.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pslHomePage {
    public static final Target LINK_REGISTER_DOCTOR = Target.the("Link for register a new doctor").located(By.xpath("//a[contains(text(), 'Agregar Doctor')]"));
    public static final Target LINK_REGISTER_PATIENT = Target.the("Link for register a new patient").located(By.xpath("//a[contains(text(), 'Agregar Paciente')]"));
    public static final Target LINK_REGISTER_SCHEDULE = Target.the("Link for schedule a new medical appointment").located(By.xpath("//a[contains(text(), 'Agendar Cita')]"));
    public static final Target INPUT_NAME = Target.the("Element where do write a name").located(By.id("name"));
    public static final Target INPUT_LASTNAME = Target.the("Element where do write a lastname").located(By.id("last_name"));
    public static final Target INPUT_PHONE = Target.the("Element where do write a phone").located(By.id("telephone"));
    public static final Target SELECT_DOCUMENT_TYPE = Target.the("Element where do select a document type").located(By.id("identification_type"));
    public static final Target INPUT_NUMBER_DOCUMENT = Target.the("Element where do write a number document").located(By.id("identification"));
    public static final Target BUTTON_SAVE = Target.the("button for save the information").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final Target TITLE_RESULT = Target.the("title for verify the result").located(By.xpath("//h3[@class='panel-title']"));
    public static final Target INPUT_NAME_PATIENT = Target.the("Element where do write a name").located(By.name("name"));
    public static final Target INPUT_LASTNAME_PATIENT = Target.the("Element where do write a lastname").located(By.name("last_name"));
    public static final Target INPUT_PHONE_PATIENT = Target.the("Element where do write a phone").located(By.name("telephone"));
    public static final Target SELECT_DOCUMENT_TYPE_PATIENT = Target.the("Element where do select a document type").located(By.name("identification_type"));
    public static final Target INPUT_NUMBER_DOCUMENT_PATIENT = Target.the("Element where do write a number document").located(By.name("identification"));
    public static final Target CHECK_PREPAGADA = Target.the("check 1").located(By.name("prepaid"));
    public static final Target INPUT_DATE = Target.the("Element where do write a date").located(By.id("datepicker"));
    public static final Target INPUT_NUMBER_DOCUMENT_PATIENT_SCHEDULE = Target.the("Element where do write a number document").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
    public static final Target INPUT_NUMBER_DOCUMENT_DOCTOR_SCHEDULE = Target.the("Element where do write a number document").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
    public static final Target TEXTAREA_DESCRIPTION = Target.the("Element where do write a description").located(By.xpath("//textarea[@class='form-control']"));
}
