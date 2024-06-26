package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeUI.ID_CARD_ELEMENTS;
import static co.com.screenplay.project.utils.Constans.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FunctionsElementsTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Scroll.to(ID_CARD_ELEMENTS));
         actor.attemptsTo(WaitUntil.the(ID_CARD_ELEMENTS,isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(ID_CARD_ELEMENTS));
    }

    public static FunctionsElementsTask choose(){
        return Tasks.instrumented(FunctionsElementsTask.class);
    }


}
