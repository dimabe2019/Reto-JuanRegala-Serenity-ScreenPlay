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

public class JuanRegalaExitoFailStepDefinitions {

        @Before
        public void before() throws IOException {
            OnStage.setTheStage(new OnlineCast());
        }

        @When("^digita el producto en el buscador$")
        public void digitaElProductoEnElBuscador(List<Producto> productos){
            OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnJuanRegala.on(productos.get(0).getNombreProducto()));
        }

        @Then("^puede observar un producto en la busqueda$")
        public void puedeObservarUnProductoEnLaBusqueda(){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(JuanRegalaUserInterface.LBL_PRODUCTO_JUANREGALA.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
        }

        @When("^ingresa el producto fallido en el buscador$")
        public void ingresaElProductoFallidoEnElBuscador(List<Producto> productos){
            OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnJuanRegala.on(productos.get(0).getNombreProducto()));
        }

        @Then("^podre ver un producto en la busqueda$")
        public void podreVerUnProductoEnLaBusqueda(){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(JuanRegalaUserInterface.LBL_PRODUCTO_JUANREGALA.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
        }

}
