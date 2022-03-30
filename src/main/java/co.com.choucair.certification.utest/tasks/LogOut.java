package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestLogOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LogOut implements Task{
    public static LogOut onThePage() {
        return Tasks.instrumented(LogOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UtestLogOutPage.EXPAND_BUTTON),
                Click.on(UtestLogOutPage.LOGOUT_BUTTON));
    }
}
