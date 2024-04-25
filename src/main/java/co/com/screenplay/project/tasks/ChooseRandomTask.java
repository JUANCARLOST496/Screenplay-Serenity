package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class ChooseRandomTask implements Task {
    private String numberRandomBtn;

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static ChooseRandomTask witchParams(String numberRandomBtn){
        return Tasks.instrumented(ChooseRandomTask.class,numberRandomBtn);
    }

}
