package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button register")
            .located(By.xpath("//a[contains(text(), 'Join Today')]"));

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));//id

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));//id

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where do we write the email")
            .located(By.id("email"));//id

    public static final Target SELECT_DATE_MONTH = Target.the("where do we write the month")
            .located(By.id("birthMonth"));//id

    public static final Target OPTION_DATE_MONTH = Target.the("where do we write the month")
            .located(By.xpath("//option[contains(text(), 'January')]"));//id

    public static final Target SELECT_DATE_DAY = Target.the("where do we write the day")
            .located(By.id("birthDay"));//id

    public static final Target OPTION_DATE_DAY = Target.the("where do we write the day")
            .located(By.xpath("//option[contains(text(), '1')]"));//id

    public static final Target SELECT_DATE_YEAR = Target.the("where do we write the year")
            .located(By.id("birthYear"));//id

    public static final Target OPTION_DATE_YEAR = Target.the("where do we write the year")
            .located(By.xpath("//option[contains(text(), '1990')]"));//id

    public static final Target NEXT_LOCATION = Target.the("next button")
            .located(By.xpath("//span[contains(text(), 'Next: Location')]"));//id

    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));//id

    public static final Target INPUT_ZIP_CODE = Target.the("where do we write the city")
            .located(By.id("zip"));//id

    public static final Target SELECT_COUNTRY = Target.the("where do we write the city")
            .located(By.xpath("//span[contains(text(), 'Colombia')]"));//id

    public static final Target NEXT_DEVICES = Target.the("next button")
            .located(By.xpath("//span[contains(text(), 'Next: Devices')]"));//id

    public static final Target SELECT_VERSION = Target.the("where do we write the city")
            .located(By.xpath("//placeholder[contains(text(), 'Select a Version')]"));//id

    public static final Target SELECT_LANGUAGE = Target.the("where do we write the city")
            .located(By.xpath("//span[contains(text(), 'English')]"));//id
}
