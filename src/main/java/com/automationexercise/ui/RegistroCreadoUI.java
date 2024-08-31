package com.automationexercise.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroCreadoUI {

    public static Target REGISTRO_CREADO = Target.the("Validar registro creado").locatedBy("//h2[@data-qa='account-created']");
    public static Target LOGIN_BTN = Target.the("Ingresar a Login").locatedBy("//a[@href='/login']");



}
