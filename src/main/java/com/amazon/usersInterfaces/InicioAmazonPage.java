package com.amazon.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/-/es/")
public class InicioAmazonPage extends PageObject {

    public static final Target LST_CATEGORIAS = Target.the("seleccionar una categoria arte y artesanias")
            .located(By.xpath("//select[@id='searchDropdownBox']"));



    public static final Target BTN_BUSCAR = Target.the("Clic Buscar productos")
            .located(By.id("nav-search-submit-button"));



    public static final Target BTN_IDENTIFICATE = Target.the("Clic en identificate para mostrar datos necesarios para registro usuario")
            .located(By.id("nav-link-accountList-nav-line-1"));






}
