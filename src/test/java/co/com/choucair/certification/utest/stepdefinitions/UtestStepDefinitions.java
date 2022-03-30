package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.LogOut;
import co.com.choucair.certification.utest.model.UtestData;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import co.com.choucair.certification.utest.tasks.Login;

import co.com.choucair.certification.utest.tasks.OpenUp;

import java.util.List;

public class UtestStepDefinitions {
    //Patron Screenplay
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than manuel wants to learn automation at the utest$")
    public void thatManuelWantsToLearnAutomationAtTheUtest(List<UtestData> UtestData) throws Exception {
        OnStage.theActorCalled("Manuel").wasAbleTo(OpenUp.thePage(),(Login.
                onThePage(UtestData.get(0).getStrUsername(),UtestData.get(0).getStrPassword())));
    }
    @When("^he finds the coursed called utest$")
    public void heFindsTheCoursedCalledUtest(){

    }

    @Then("^the user Logout with their credentials")
    public void theUserLogoutWithTheirCredentials(){
        OnStage.theActorCalled("Manuel").attemptsTo(LogOut.onThePage());
    }
}

