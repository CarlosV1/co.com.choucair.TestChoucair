package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PageContinue;

public class PageRegister implements Task {
    private String record;
    private String strName;
    private String strLastName;
    private Integer intAdress;
    private String strEmail;
    private Integer intPhone;
    private String strGender;
    private String strHobbies;
    private String strLanguages;
    private String strSkills;
    private String strCountry;
    private String strPassword;
    private String strCPaswword;

    public PageRegister(String strName, String strLastName, Integer intAdress, String strEmail, Integer intPhone, String strGender, String strHobbies, String strLanguages, String strSkills, String strCountry, String strPassword, String strCPaswword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.intAdress = intAdress;
        this.strEmail = strEmail;
        this.intPhone = intPhone;
        this.strGender = strGender;
        this.strHobbies = strHobbies;
        this.strLanguages = strLanguages;
        this.strSkills = strSkills;
        this.strCountry = strCountry;
        this.strPassword = strPassword;
        this.strCPaswword = strCPaswword;
    }

    public PageRegister OnThePage(){
        return Tasks.instrumented(PageRegister.class, strName, strLastName, intAdress, strEmail, intPhone, strGender, strHobbies, strLanguages,
                strSkills, strCountry, strPassword, strCPaswword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(userinterface.PageContinue.FIRST_NAME), (Performable) Enter.theValue(strName));
        actor.attemptsTo(Click.on(userinterface.PageContinue.LAST_NAME), (Performable) Enter.theValue(strLastName));
        actor.attemptsTo(Click.on(userinterface.PageContinue.ADDRESS), (Performable) Enter.theValue(intAdress));
        actor.attemptsTo(Click.on(PageContinue.EMAIL), (Performable) Enter.theValue(strEmail));
        actor.attemptsTo(Click.on(PageContinue.PHONE), (Performable) Enter.theValue(intPhone));
        actor.attemptsTo(Click.on(PageContinue.GENDER), (Performable) Enter.theValue(strGender));
        actor.attemptsTo(Click.on(PageContinue.HOBBIES), (Performable) Enter.theValue(strHobbies));
        actor.attemptsTo(Click.on(PageContinue.LANGUAGES), (Performable) Enter.theValue(strLanguages));
        actor.attemptsTo(Click.on(PageContinue.SKILLS), (Performable) Enter.theValue(strSkills));
        actor.attemptsTo(Click.on(PageContinue.COUNTRIES), (Performable) Enter.theValue(strCountry));
        actor.attemptsTo(Click.on(PageContinue.COUNTRY));
        actor.attemptsTo(Click.on(PageContinue.YEAR));
        actor.attemptsTo(Click.on(PageContinue.MONTH));
        actor.attemptsTo(Click.on(PageContinue.DAY));
        actor.attemptsTo(Click.on(PageContinue.PASSWORD), (Performable) Enter.theValue(strPassword));
        actor.attemptsTo(Click.on(PageContinue.CPASSWORD), (Performable) Enter.theValue(strCPaswword));
        actor.attemptsTo(Click.on(PageContinue.SUBMIT));
    }
}
