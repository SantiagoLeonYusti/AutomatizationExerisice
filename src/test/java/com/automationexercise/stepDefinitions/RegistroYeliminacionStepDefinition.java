package com.automationexercise.stepDefinitions;

import com.automationexercise.tasks.EliminarCuentaTask;
import com.automationexercise.tasks.IngresoRegistroTask;
import com.automationexercise.tasks.RegistroTask;
import com.automationexercise.tasks.VerificacionRegistroTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroYeliminacionStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario está en la página de inicio")
    public void queElUsuarioEstáEnLaPáginaDeInicio() {
        theActorCalled("usuario").wasAbleTo(
                Open.url("https://automationexercise.com/")
        );

    }
    @Cuando("el usuario navega a la página de registro")
    public void elUsuarioNavegaALaPáginaDeRegistro() {
        theActorInTheSpotlight().attemptsTo(
                IngresoRegistroTask.on()
        );

    }
    @Cuando("el usuario completa el proceso de registro")
    public void elUsuarioCompletaElProcesoDeRegistro() {
        theActorInTheSpotlight().attemptsTo(
                RegistroTask.on()
        );

    }
    @Entonces("la cuenta del usuario es creada")
    public void laCuentaDelUsuarioEsCreada() {
        theActorInTheSpotlight().attemptsTo(
                VerificacionRegistroTask.on()
        );


    }
    @Cuando("el usuario inicia sesión en la cuenta")
    public void elUsuarioIniciaSesiónEnLaCuenta() {

    }
    @Cuando("el usuario elimina la cuenta")
    public void elUsuarioEliminaLaCuenta() {
        theActorInTheSpotlight().attemptsTo(
                EliminarCuentaTask.on()
        );


    }
    @Entonces("la cuenta es eliminada exitosamente")
    public void laCuentaEsEliminadaExitosamente() {
    }
}
