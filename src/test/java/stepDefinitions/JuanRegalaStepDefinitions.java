package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import tasks.BuscarProductoEnJuanRegala;
import userinterface.JuanRegalaUserInterface;

import java.io.IOException;

public class JuanRegalaStepDefinitions {

    /*Antes de ejecutar nuestras ejecuten nuestros metodos creamos nuestro actor por medio de la clase OnStage
    * OnStage -> Nos permite pasar el nombre del actor a los metodos*/
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en la pagina de JuanRegala con la url (.*)$")
    public void queMeEncuentroEnLaPaginaDeJuanRegalaConLaUrlUrl(String url) {
        /*Una vez que hemos configurado el elenco, cualquier paso puede referirse a un actor por su nombre */
        //theActorCalled -> invocar
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
    }

    @When("^busco el producto (.*) en el buscador$")
    public void buscoElProductoProductoEnElBuscador(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnJuanRegala.on(producto));
    }

    @Then("^podre ver el producto (.*) en pantalla$")
    public void podreVerElProductoProductoEnPantalla(String producto) {
        //should llamada instancia de Actor
        //Se crea una consecuencia ->GivenWhenThen.seeThat()
        //descripcion del producto del elemento vs descripcion del producto del parametro
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(JuanRegalaUserInterface.LBL_PRODUCTO_JUANREGALA.of(producto)), WebElementStateMatchers.containsText(producto)));
    }
}

/*Para convertir un localizador en una pregunta (question) sobre el estado del elemento, usamos WebElementQuestion
* tiene tres metodos: WebElementQuestion (state.of(), valueOf(),the())*/