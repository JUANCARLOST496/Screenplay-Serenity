package co.com.screenplay.project.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class WebOpen {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }



    @Y("deseo validar funcion carta de elementos")
    public void deseoValidarFuncionCartaDeElementos() {

    }

    @Cuando("selecciona aleatoriamente alguna de las funciones")
    public void seleccionaAleatoriamenteAlgunaDeLasFunciones() {
    }

    @Entonces("vizualizas en la cabezaera el nombre de le opcion elegida")
    public void vizualizasEnLaCabezaeraElNombreDeLeOpcionElegida() {

    }
}
