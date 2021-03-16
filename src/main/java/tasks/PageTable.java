package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.WebTable;

public class PageTable implements Task {
    public static PageTable OnThePage(){
        return Tasks.instrumented(PageTable.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WebTable.TABLE));

    }
}