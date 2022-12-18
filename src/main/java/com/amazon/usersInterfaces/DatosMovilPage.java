package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DatosMovilPage extends PageObject {

    public static final Target BTN_PREFIJO_CELULAR = Target.the("Clic para desplegar prefijo movil disponibles")
            .located(By.xpath("//span[@class='a-button-text a-declarative']"));


    public static final Target BTN_PREFIJO_COLOMBIA = Target.the("Clic para seleccionar opcion prefijo colombia")
            .located(By.xpath("//span[.='Colombia ']"));



    public static final Target TXT_NUMERO_MOVIL = Target.the("Ingresr numero de telefono movil")
            .located(By.xpath("//input[@name='cvf_phone_num']"));


    public static final Target BTN_ENVIAR = Target.the("Clic enviar datos de telefono celular")
            .located(By.xpath("//input[@name='cvf_action']"));

    public static final Target TXT_TELEFONO = Target.the("ingresar numero de telefono celular")
            .located(By.xpath("//input[@name='cvf_phone_num']"));






}
