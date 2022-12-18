package com.amazon.questions;

import com.amazon.usersInterfaces.MensajeCarroVacio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCarroVacio implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return MensajeCarroVacio.MSJ_VALIDACION_CARRO_VACIO.resolveFor(actor).isVisible();
    }

    public static Question validar (){

        return new ValidacionCarroVacio();
    }
}
