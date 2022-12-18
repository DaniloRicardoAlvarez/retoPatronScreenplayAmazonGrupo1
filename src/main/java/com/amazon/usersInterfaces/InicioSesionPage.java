package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionPage extends PageObject {


    public static final Target BTN_INICIO_REGISTRO = Target.the("Clic para inicio registro")
            .located(By.id("createAccountSubmit"));



}
