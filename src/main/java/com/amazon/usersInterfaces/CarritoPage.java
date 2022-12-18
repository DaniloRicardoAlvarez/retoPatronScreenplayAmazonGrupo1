package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage extends PageObject {


    public static final Target BTN_ELIMINAR_PRODUCTO2 =  Target.the("clic en eliminar segundo producto de carrito")
            .located(By.xpath("(//input[@value='Eliminar'])[2]"));

    public static final Target BTN_ELIMINAR_PRODUCTO1 =  Target.the("clic en eliminar primer producto de carrito")
            .located(By.xpath("(//input[@value='Eliminar'])[1]"));




}
