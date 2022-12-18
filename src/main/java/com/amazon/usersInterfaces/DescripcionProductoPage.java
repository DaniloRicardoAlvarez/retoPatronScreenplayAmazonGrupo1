package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DescripcionProductoPage extends PageObject {

    public static final Target BTN_CANTIDAD_PRODUCTO =  Target.the("clic ver lista cantidad de producto a seleccionar ")
            .located(By.xpath("//span[.='Cantidad:']"));


    public static final Target BTN_UNIDADES_PRODUCTO =  Target.the("clic en numero de unidades del producto")
            .located(By.xpath("//a[.='3 ']"));


    public static final Target BTN_AGREGAR_CARRITO =  Target.the("clic agregar producto a carrito")
            .located(By.xpath("//input[@id='add-to-cart-button']"));


    public static final Target BTN_PAGINA_ANTERIOR =  Target.the("clic para regresar a la pagina anterior")
            .located(By.xpath("//a[@id='breadcrumb-back-link']"));



}
