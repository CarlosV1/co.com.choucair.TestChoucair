package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LoginContinue;

public class Login implements Task {
    public static Login OnThePage(){
        return Tasks.instrumented(Login.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginContinue.CONTINUE_BUTTON));

    }
}
