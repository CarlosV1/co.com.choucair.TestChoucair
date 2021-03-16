package userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginContinue extends PageObject {
    public static final Target CONTINUE_BUTTON = Target.the("button to continue").located(By.id("enterimg"));
}
