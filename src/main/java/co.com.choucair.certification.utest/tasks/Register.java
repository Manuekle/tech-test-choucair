package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strCity;
    private String strZipCode;
    private String strCountry;
    private String strPassword;

    public Register(String strFirstName, String strLastName, String strEmailAddress, String strCity, String strZipCode, String strCountry, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
        this.strPassword = strPassword;
    }

    public static Register onThePage(String strFirstName, String strLastName, String strEmailAddress, String strCity, String strZipCode, String strCountry, String strPassword) {
        return Tasks.instrumented(Register.class,strFirstName,strLastName,strEmailAddress,strCity,strZipCode,strCountry,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(UtestRegisterPage.INPUT_EMAIL_ADDRESS),
                Click.on(UtestRegisterPage.SELECT_DATE_MONTH),
                Click.on(UtestRegisterPage.OPTION_DATE_MONTH),
                Click.on(UtestRegisterPage.SELECT_DATE_DAY),
                Click.on(UtestRegisterPage.OPTION_DATE_DAY),
                Click.on(UtestRegisterPage.SELECT_DATE_YEAR),
                Click.on(UtestRegisterPage.OPTION_DATE_YEAR),
                Click.on(UtestRegisterPage.NEXT_LOCATION),
                Enter.theValue(strCity).into(UtestRegisterPage.INPUT_CITY),
                Enter.theValue(strZipCode).into(UtestRegisterPage.INPUT_ZIP_CODE),
                //Click.on(UtestRegisterPage.SELECT_COUNTRY),
                //Click.on(UtestRegisterPage.OPTION_COUNTRY),
                Click.on(UtestRegisterPage.NEXT_DEVICES),
                //Click.on(UtestRegisterPage.SELECT_SO),
                //Click.on(UtestRegisterPage.OPTION_SO),
                Click.on(UtestRegisterPage.SELECT_SO_VERSION),
                Click.on(UtestRegisterPage.OPTION_SO_VERSION),
                Click.on(UtestRegisterPage.SELECT_LA),
                Click.on(UtestRegisterPage.OPTION_LA),
                Click.on(UtestRegisterPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_PASSWORD1),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_PASSWORD2),
                Click.on(UtestRegisterPage.SELECT_TERMS),
                Click.on(UtestRegisterPage.SELECT_PRIVACY),
                Click.on(UtestRegisterPage.BUTTON_REGISTER)
        );
    }

}
