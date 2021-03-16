package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class WebTable extends PageObject {
    public static final Target TABLE = Target.the("Input first name").located(By.xpath("//input[contains(@class='ui-grid-viewport ng-isolate-scope')]"));

}
