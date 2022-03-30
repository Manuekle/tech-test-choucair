package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLogOutPage extends PageObject {
    public static final Target EXPAND_BUTTON = Target.the("expand button")
            .located(By.xpath("//i[contains(text(),'expand_more')]"));

    public static final Target LOGOUT_BUTTON = Target.the("Logout button")
            .located(By.xpath("//a[contains(text(),'Sign Out')]"));
}
