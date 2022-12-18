package com.amazon.tasks;

import com.amazon.utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.amazon.usersInterfaces.ArteManualidadesPage.*;
import static com.amazon.usersInterfaces.CarritoPage.*;
import static com.amazon.usersInterfaces.DescripcionProductoPage.*;
import static com.amazon.usersInterfaces.InicioAmazonPage.*;
import static com.amazon.usersInterfaces.SubtotalCarritoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarProductos implements Task {

    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","SeleccionarCategoria",1,0)).from(LST_CATEGORIAS),
                    Click.on(BTN_BUSCAR),
                    WaitUntil.the(IMG_PRODUCTO1, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(IMG_PRODUCTO1),
                    Click.on(BTN_CANTIDAD_PRODUCTO),
                    Click.on(BTN_UNIDADES_PRODUCTO),
                    Click.on(BTN_AGREGAR_CARRITO),
                    SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("DataExcelAmazon.xlsx","SeleccionarCategoria",1,0)).from(LST_CATEGORIAS),
                    Click.on(BTN_BUSCAR),
                    WaitUntil.the(IMG_PRODUCTO2, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(IMG_PRODUCTO2),
                    Click.on(BTN_AGREGAR_CARRITO),
                    Click.on(BTN_IR_CARRITO),
                    Click.on(BTN_ELIMINAR_PRODUCTO2),
                    Click.on(BTN_ELIMINAR_PRODUCTO1)

            );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static EliminarProductos eliminarProductos (){

        return instrumented (EliminarProductos.class);

    }


}
