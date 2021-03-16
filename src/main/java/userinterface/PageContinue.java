package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageContinue extends PageObject {
    public static final Target FIRST_NAME = Target.the("Input first name").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched')]"));
    public static final Target LAST_NAME = Target.the("Input last name").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required')]"));
    public static final Target ADDRESS = Target.the("Input address").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-valid ng-touched')]"));
    public static final Target EMAIL = Target.the("Input email").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched')]"));
    public static final Target PHONE = Target.the("Input phone").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched')]"));
    public static final Target GENDER = Target.the("Input gender").located(By.xpath("//input[contains(@class='ng-dirty ng-valid ng-valid-required ng-touched ng-valid-parse')]"));
    public static final Target HOBBIES = Target.the("Input hobbies").located(By.id("checkbox1"));
    public static final Target LANGUAGES = Target.the("Input languages").located(By.id("msdd"));
    public static final Target SKILLS = Target.the("Input skills").located(By.id("skills"));
    public static final Target COUNTRIES = Target.the("Input countries").located(By.id("countries"));
    public static final Target COUNTRY = Target.the("Input phone").located(By.xpath("//input[contains(@class='select2-selection select2-selection--single')]"));
    public static final Target YEAR = Target.the("Input year").located(By.id("yearbox"));
    public static final Target MONTH = Target.the("Input month").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required')]"));
    public static final Target DAY = Target.the("Input day").located(By.id("daybox"));
    public static final Target PASSWORD = Target.the("Input password").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-minlength ng-touched')]"));
    public static final Target CPASSWORD = Target.the("Input confirm password").located(By.xpath("//input[contains(@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required')]"));
    public static final Target SUBMIT = Target.the("Button submit").located(By.id("submitbtn"));
}
