package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//identified objects (locators)
public class UtestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that show us the form to login")
            .located(By.xpath("//a[contains(text(),'Log In')]"));//xpath relative, name
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("username"));//id
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));//id
    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn')]"));//class, xpath
}
