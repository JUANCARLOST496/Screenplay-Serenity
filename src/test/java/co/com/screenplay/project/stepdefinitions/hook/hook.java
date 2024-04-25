package co.com.screenplay.project.stepdefinitions.hook;

import co.com.screenplay.project.hook.OpenWeb;
import co.com.screenplay.project.utils.Time;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

import static co.com.screenplay.project.utils.Constans.TIME_SHORT;
import static co.com.screenplay.project.utils.Constans.TITLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre el sitio web de pruebas")
    public void abrirSitioWeb(String actor) {
    OnStage.theActorCalled(actor).attemptsTo(
            OpenWeb.browserUrl()
    );
        Time.waiting(TIME_SHORT);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheWebPage.title(), Matchers.containsString(TITLE)));
    }
}
