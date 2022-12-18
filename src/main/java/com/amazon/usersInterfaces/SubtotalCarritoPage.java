package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SubtotalCarritoPage extends PageObject {

    public static final Target BTN_IR_CARRITO = Target.the("Clic para ir directo a carrito de compras ")
            .located(By.xpath("//a[@href='/-/es/gp/cart/view.html?ref_=sw_gtc']"));



}
