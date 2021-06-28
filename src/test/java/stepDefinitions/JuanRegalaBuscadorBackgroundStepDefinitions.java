package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnJuanRegala;
import userinterface.JuanRegalaUserInterface;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;
import java.util.List;

public class JuanRegalaBuscadorBackgroundStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^busco un producto en el buscador$")
    public void buscoUnProductoEnElBuscador(List<Producto> productos) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnJuanRegala.on(productos.get(0).getNombreProducto()));
    }


    @Then("^podre ver el producto buscado en la pantalla$")
    public void podreVerElProductoBuscadoEnLaPantalla() {
        //la descripcion del producto que pasamos al elemento vs la descripcion del producto del elemento seleccionado
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(JuanRegalaUserInterface.LBL_PRODUCTO_JUANREGALA.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));

    }
}
