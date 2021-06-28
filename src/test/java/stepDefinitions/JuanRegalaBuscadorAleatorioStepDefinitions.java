package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoAleatorioEnJuanRegala;
import userinterface.JuanRegalaUserInterface;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;


public class JuanRegalaBuscadorAleatorioStepDefinitions {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^busco un producto aleatorio en la pagina$")
    public void buscoUnProductoAleatorioEnLaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioEnJuanRegala.on());

    }

    @Then("^podre ver un producto aleatorio en pantalla$")
    public void podreVerUnProductoAleatorioEnPantalla() {
        //Descripcion del producto antes de realizar el random vs Descripcion del producto cuando ya el random a realizado el sorteo
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(JuanRegalaUserInterface.LBL_PRODUCTO_JUANREGALA.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
    }
}
