package com.amazon.stepDefinitions;

import com.amazon.questions.ValidacionCarroVacio;
import com.amazon.tasks.EliminarProductos;
import com.amazon.usersInterfaces.InicioAmazonPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EliminarProductosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor danilo = Actor.named("danilo");
    private InicioAmazonPage inicioAmazonPage = new InicioAmazonPage();


    @Before
    public void configuracion (){
        danilo.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario se encuentre en la pagina web de amazon$")
    public void elUsuarioSeEncuentreEnLaPaginaWebDeAmazon() {

        danilo.wasAbleTo(Open.browserOn(inicioAmazonPage));

    }


    @Cuando("^el usuario ingresa a una categoria viene selecciona tres unidades del mismo producto luego escoge otro producto los agrega a carrito para posteriormente eliminarlos de carrito de compras$")
    public void elUsuarioIngresaAUnaCategoriaVieneSeleccionaTresUnidadesDelMismoProductoLuegoEscogeOtroProductoLosAgregaACarritoParaPosteriormenteEliminarlosDeCarritoDeCompras() {

        danilo.attemptsTo(

                EliminarProductos.eliminarProductos()
        );

    }

    @Entonces("^el visualizara un mensaje carrito de amazon esta vacio$")
    public void elVisualizaraUnMensajeCarritoDeAmazonEstaVacio() {

        danilo.should(seeThat( "El actor puede ver ", ValidacionCarroVacio.validar(), Matchers.equalTo(true)));

    }
}
