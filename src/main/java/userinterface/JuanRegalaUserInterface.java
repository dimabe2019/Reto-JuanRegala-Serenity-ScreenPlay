package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class JuanRegalaUserInterface {

    public static final Target BTN_AGENCIA_JUANREGALA = Target.the("Boton para seleccionar la sede o ciudad").locatedBy("//img[@src='https://juanregala.com.co/media/wysiwyg/banners/BANNER-CIUDADES-JR-2020-BOGOTA-A_1.jpg']");
    public static final Target TXT_BUSCADOR_JUANREGALA = Target.the("Campo donde se ejecutara la busqueda del producto").locatedBy("//*[@id='search']");
    public static final Target BTN_BUSCADOR_JUANREGALA = Target.the("Boton para buscar el producto ingresado en el campo anterior").locatedBy("//button[@id='basic-search']");
    public static final Target BTN_PRODUCTO_JUANREGALA = Target.the("producto seleccionado").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target LBL_PRODUCTO_JUANREGALA = Target.the("descripcion del producto seleccionado").locatedBy("//h1[contains(text(),'{0}')]");
    public static final Target BTN_CATEGORIA_AMIGOS_JUANREGALA = Target.the("Boton de la categoria").locatedBy("/html/body/div[1]/div/div[1]/div/div[3]/div/div[2]/div/ul/li[2]/a");
    public static final Target BTN_PRODUCTO_ALEATORIO_JUANREGALA = Target.the("Lisatodo de los productos de la categoria").locatedBy("//div[@class='product-name']");
    public static final Target LBL_NOMBRE_PRODUCTO_ALEATORIO_JUANREGALA = Target.the("Descripcion del prodcuto seleccionado").locatedBy("//div[@class='product-name']//div//a");
    //div[@class='product-name']//div//a
    //div//a
}
