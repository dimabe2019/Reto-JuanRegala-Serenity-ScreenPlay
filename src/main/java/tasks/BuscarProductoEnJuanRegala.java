package tasks;

import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.JuanRegalaUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscarProductoEnJuanRegala implements Task {

    private String producto;

    public BuscarProductoEnJuanRegala(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JuanRegalaUserInterface.BTN_AGENCIA_JUANREGALA),
                Enter.theValue(producto).into(JuanRegalaUserInterface.TXT_BUSCADOR_JUANREGALA),
                Click.on(JuanRegalaUserInterface.BTN_BUSCADOR_JUANREGALA),
                Click.on(JuanRegalaUserInterface.BTN_PRODUCTO_JUANREGALA.of(producto)),
                Esperar.estosSegundos(30)
        );
        VariablesGlobales.nombreProductoAleatorio = JuanRegalaUserInterface.LBL_PRODUCTO_JUANREGALA.of(producto).resolveFor(actor).getText();
    }

    public static BuscarProductoEnJuanRegala on(String producto) {
        //Para verificar que nuestro objeto pertenece a la clase
        return Instrumented.instanceOf(BuscarProductoEnJuanRegala.class).withProperties(producto);
    }


}
