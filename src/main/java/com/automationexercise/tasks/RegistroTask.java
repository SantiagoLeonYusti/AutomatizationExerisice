package com.automationexercise.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static com.automationexercise.ui.LoginRegisterUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Santago").into(NOMBRE).thenHit(Keys.ENTER),
                Enter.theValue("syusti4@yopmail.com").into(CORREO),
                Click.on(SIGN_UP_BTN),
                Click.on(MR_CHECK),
                Enter.theValue("asdfasfdasdf").into(PASSWORD).thenHit(Keys.ENTER),
                SelectFromOptions.byValue("27").from(DAY),
                SelectFromOptions.byVisibleText("March").from(MONTH),
                SelectFromOptions.byValue("1995").from(YEAR),
                Click.on(SELECCIONAR_NEWSLATTER),
                Click.on(SELECCIONAR_RECEIVE),
                Enter.theValue("Santiago").into(INGRESAR_NOMBRE),
                Enter.theValue("Leon").into(INGRESAR_APELLIDO),
                Enter.theValue("Casa").into(INGRESAR_DIRECCION),
                SelectFromOptions.byValue("Canada").from(SELECCIONAR_PAIS),
                Enter.theValue("Valle").into(INGRESAR_ESTADO),
                Enter.theValue("Cali").into(INGRESAR_CIUDAD),
                Enter.theValue("102101").into(INGRESAR_ZIPCODE),
                Enter.theValue("300000000").into(INGRESAR_TELEFONO)

        );
    }
    public static RegistroTask on() {
        return instrumented(RegistroTask.class);
    }
}
