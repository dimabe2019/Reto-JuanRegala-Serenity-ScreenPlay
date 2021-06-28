package tasks;

import interactions.ClicProductoAleatorio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.JuanRegalaUserInterface;

public class BuscarProductoAleatorioEnJuanRegala implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JuanRegalaUserInterface.BTN_AGENCIA_JUANREGALA),
                Click.on(JuanRegalaUserInterface.BTN_CATEGORIA_AMIGOS_JUANREGALA),
                ClicProductoAleatorio.on()
        );
    }


    public static BuscarProductoAleatorioEnJuanRegala on() {
        return Instrumented.instanceOf(BuscarProductoAleatorioEnJuanRegala.class).withProperties();
    }
}
