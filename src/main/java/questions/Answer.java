package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.asciidoctor.ast.Table;
import org.fluentlenium.core.search.Search;
import tasks.PageTable;
import userinterface.WebTable;

import javax.xml.soap.Text;

public class Answer implements Question<Boolean> {
    private String question;
    private Object Table;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
        String nameCourse= Text.of(WebTable.TABLE).viewedBy(actor).asString();
        boolean result;
        if (question.equals(Table)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
