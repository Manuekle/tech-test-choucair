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

    public Register(String strFirstName, String strLastName, String strEmailAddress) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
    }

    public static Register onThePage(String strFirstName, String strLastName, String strEmailAddress) {
        return Tasks.instrumented(Register.class,strFirstName,strLastName,strEmailAddress);
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
                Click.on(UtestRegisterPage.NEXT_BUTTON)
        );
    }

}
