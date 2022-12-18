package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeRegistro extends PageObject {


    public static final Target MSJ_VALIDACION_REGISTRO = Target.the("Clic enviar datos de telefono celular")
            .located(By.xpath("//input[@name='cvf_action']"));
}
