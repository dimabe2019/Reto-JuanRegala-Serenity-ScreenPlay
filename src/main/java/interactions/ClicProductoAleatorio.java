package interactions;

import java.util.List;
import java.util.Random;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userinterface.JuanRegalaUserInterface;
import variablesGlobales.VariablesGlobales;

public class ClicProductoAleatorio implements Interaction{


	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Random random = new Random();
		List<WebElementFacade> listaBotonesProductos = JuanRegalaUserInterface.BTN_PRODUCTO_ALEATORIO_JUANREGALA.resolveAllFor(actor);
		List<WebElementFacade> listaNombresProductos = JuanRegalaUserInterface.LBL_NOMBRE_PRODUCTO_ALEATORIO_JUANREGALA.resolveAllFor(actor);
		int numeroAleatorio = random.nextInt(listaBotonesProductos.size()+1);
		//para traerse la descripcion del producto aleatorio por medio de us posicion = numeroAleatorio
		VariablesGlobales.nombreProductoAleatorio = listaNombresProductos.get(numeroAleatorio).getText();
		listaBotonesProductos.get(numeroAleatorio).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Performable on() {
		return Instrumented.instanceOf(ClicProductoAleatorio.class).withProperties();
	}
}
