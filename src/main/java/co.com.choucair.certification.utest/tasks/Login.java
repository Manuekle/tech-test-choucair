package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strUsername;
    private String strPassword;

    public Login(String strUsername, String strPassword) {
        this.strUsername = strUsername;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUsername, String strPassword) {
        return Tasks.instrumented(Login.class,strUsername,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUsername).into(UtestLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(UtestLoginPage.INPUT_PASSWORD),
                Click.on(UtestLoginPage.ENTER_BUTTON)
        );
    }
}