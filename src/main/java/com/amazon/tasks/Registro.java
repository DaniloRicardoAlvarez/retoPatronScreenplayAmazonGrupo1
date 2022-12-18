package com.amazon.tasks;

import com.amazon.utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.io.IOException;


import static com.amazon.usersInterfaces.CrearCuentaPage.*;
import static com.amazon.usersInterfaces.DatosMovilPage.*;
import static com.amazon.usersInterfaces.InicioAmazonPage.*;
import static com.amazon.usersInterfaces.InicioSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {

    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    Click.on(BTN_IDENTIFICATE),
                    Click.on(BTN_INICIO_REGISTRO),
                    Enter.theValue(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","DatosRegistro",1,0))
                            .into(TXT_NOMBRE),
                    Enter.theValue(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","DatosRegistro",1,1))
                            .into(TXT_CORREO),
                    Enter.theValue(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","DatosRegistro",1,2))
                            .into(TXT_CONTRASENA),
                    Enter.theValue(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","DatosRegistro",1,3))
                            .into(TXT_CONFIRMAR_CONTRASENA),
                    Click.on(BTN_VERIFICAR_CORREO),

                    WaitUntil.the(BTN_PREFIJO_CELULAR, WebElementStateMatchers.isClickable()).forNoMoreThan(150).seconds(),

                    Click.on(BTN_PREFIJO_CELULAR),
                    Click.on(BTN_PREFIJO_COLOMBIA),
                    Enter.theValue(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","DatosRegistro",1,4))
                            .into(TXT_NUMERO_MOVIL),
                    Click.on(BTN_ENVIAR),
                    WaitUntil.the(TXT_TELEFONO, WebElementStateMatchers.isClickable()).forNoMoreThan(25).seconds()






            );
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Registro dataRegistro (){

        return instrumented (Registro.class);

    }
}
