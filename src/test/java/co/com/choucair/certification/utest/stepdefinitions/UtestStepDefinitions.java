package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.LogOut;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import co.com.choucair.certification.utest.tasks.Login;

import co.com.choucair.certification.utest.tasks.OpenUp;

public class UtestStepDefinitions {
    //Patron Screenplay
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than manuel wants to learn automation at the utest$")
    public void thatManuelWantsToLearnAutomationAtTheUtest(){
        OnStage.theActorCalled("Manuel").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^the user Logout with their credentials")
    public void theUserLogoutWithTheirCredentials(){
        OnStage.theActorCalled("Manuel").attemptsTo(LogOut.onThePage());
    }

    //@Then("^he finds the coursed called Recursos Automatización Bancolombia$")
    //public void heFindsTheCoursedCalledRecursosAutomatizaciónBancolombia(){

    //}
}

