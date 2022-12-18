package com.amazon.stepDefinitions;

import com.amazon.questions.ValidacionRegistroExitoso;
import com.amazon.tasks.Registro;
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

public class RegistroStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor danilo = Actor.named("danilo");
    private InicioAmazonPage inicioAmazonPage = new InicioAmazonPage();


    @Before
    public void configuracion (){
        danilo.can(BrowseTheWeb.with(navegador));
    }



    @Dado("^el usuario se encuentre en la pagina web de amazon\\.com$")
    public void elUsuarioSeEncuentreEnLaPaginaWebDeAmazonCom() {

        danilo.wasAbleTo(Open.browserOn(inicioAmazonPage));

    }


    @Cuando("^el diligencia toda la informacion de registro la envia$")
    public void elDiligenciaTodaLaInformacionDeRegistroLaEnvia() {


        danilo.attemptsTo(

                Registro.dataRegistro()

        );



    }

    @Entonces("^el visualizara un mensaje de bienvenida con su nombre en el perfil de usuario$")
    public void elVisualizaraUnMensajeDeBienvenidaConSuNombreEnElPerfilDeUsuario() {


        danilo.should(seeThat( "El actor puede ver ", ValidacionRegistroExitoso.validarRegistro(), Matchers.equalTo(true)));

    }
}
