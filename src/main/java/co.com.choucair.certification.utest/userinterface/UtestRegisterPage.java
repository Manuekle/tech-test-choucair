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

    public static final Target INPUT_ZIP_CODE = Target.the("where do we write the zip code")
            .located(By.id("zip"));//id

    public static final Target SELECT_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//span[contains(text(), 'Select a country')]"));//id

    public static final Target OPTION_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//span[contains(text(), 'Colombia')]"));//id

    public static final Target NEXT_DEVICES = Target.the("next button")
            .located(By.xpath("//span[contains(text(), 'Next: Devices')]"));//id

    public static final Target SELECT_SO = Target.the("Open SO")
            .located(By.xpath("//span[contains(text(), 'Select OS')]"));//id

    public static final Target OPTION_SO = Target.the("Select SO")
            .located(By.xpath("//div[contains(text(), 'Linux')]"));//id

    public static final Target SELECT_SO_VERSION = Target.the("Open SO version")
            .located(By.xpath("//span[contains(text(), 'Select a Version')]"));//id

    public static final Target OPTION_SO_VERSION = Target.the("Select SO version")
            .located(By.xpath("//div[contains(text(), 'Debian')]"));//id

    public static final Target SELECT_LA = Target.the("Open language")
            .located(By.xpath("//span[contains(text(), 'Select OS language')]"));//id

    public static final Target OPTION_LA = Target.the("Select language")
            .located(By.xpath("//div[contains(text(), 'English')]"));//id

    public static final Target NEXT_LAST_STEP = Target.the("Final button")
            .located(By.xpath("//span[contains(text(), 'Next: Last Step')]"));//id

    public static final Target INPUT_PASSWORD1 = Target.the("where do we write the password")
            .located(By.id("password"));//id

    public static final Target INPUT_PASSWORD2 = Target.the("where do we write the confirmPassword")
            .located(By.id("confirmPassword"));//id

    public static final Target SELECT_TERMS = Target.the("where do we select the terms")
            .located(By.id("termOfUse"));//id

    public static final Target SELECT_PRIVACY = Target.the("where do we select the privacy")
            .located(By.id("privacySetting"));//id

    public static final Target BUTTON_REGISTER = Target.the("button register")
            .located(By.xpath("//span[contains(text(), 'Complete Setup')]"));//id
}