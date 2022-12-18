package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ArteManualidadesPage extends PageObject {

    public static final Target IMG_PRODUCTO1 =  Target.the("clic en un producto1  de la categoria arte y artesanias")
            .located(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71WoEAZhlmL._AC_UL320_.jpg']"));

    public static final Target IMG_PRODUCTO2 =  Target.the("clic en un producto2  de la categoria arte y artesanias")
            .located(By.xpath("//img[@src='https://m.media-amazon.com/images/I/81iBmVzkFoS._AC_UL320_.jpg']"));
}
