package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearCuentaPage extends PageObject {


    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre de usuario")
            .located(By.id("ap_customer_name"));

    public static final Target TXT_CORREO = Target.the("Ingresar correo de usuario")
            .located(By.id("ap_email"));

    public static final Target TXT_CONTRASENA = Target.the("Ingresar contrasena de usuario")
            .located(By.id("ap_password"));

    public static final Target TXT_CONFIRMAR_CONTRASENA = Target.the("Ingresar de nuevo contrasena para confirmar")
            .located(By.id("ap_password_check"));

    public static final Target BTN_VERIFICAR_CORREO = Target.the("Clic para verificar correo")
            .located(By.xpath("//input[@id='continue']"));


}
