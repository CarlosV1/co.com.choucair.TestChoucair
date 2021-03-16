package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.PageAutomationData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import sun.security.ssl.Record;
import tasks.Login;
import tasks.OpenUp;
import tasks.PageRegister;

import java.util.List;

public class RegistroUsuarioStepDefinitions {

    private String question;

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Carlos will register in Automation$")
    public void that_carlos_will_register_in_automation(List<PageAutomationData> pageAutomationData) throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), Login.OnThePage());
    }

    @When("^ He will fill out the registration form$")
    public void he_will_fill_out_the_registration_form(List<PageAutomationData> pageAutomationData) throws Exception  {
        OnStage.theActorCalled("Carlos").attemptsTo(Record.thePage(PageAutomationData.get(0).getStrName(),PageAutomationData.get(0).getStrLastName(),
                PageAutomationData.get(0).getIntAdress(),PageAutomationData.get(0).getStrEmail(),PageAutomationData.get(0).getIntPhone(),PageAutomationData.get(0).getStrStrGender(),
                PageAutomationData.get(0).getStrHobbies(),PageAutomationData.get(0).getStrLanguages(),PageAutomationData.get(0).getStrSkills(),PageAutomationData.get(0).getStrCountry(),
                PageAutomationData.get(0).getStrPassword(),PageAutomationData.get(0).getStrCPassword()));
    }

    @Then("^ You will register successfully$")
    public void you_will_register_successfully(List<PageAutomationData> pageAutomationData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
