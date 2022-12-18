package com.amazon.questions;

import com.amazon.usersInterfaces.MensajeRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistroExitoso implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return MensajeRegistro.MSJ_VALIDACION_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question validarRegistro(){

        return new ValidacionRegistroExitoso();
    }
}
