package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.ChoucairAcademyData;
import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificacion.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair()  {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));

    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course) {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(String question)  {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
