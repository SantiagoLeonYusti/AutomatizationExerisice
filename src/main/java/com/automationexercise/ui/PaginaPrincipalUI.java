package com.automationexercise.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalUI {

    public static Target REGISTRO_BTN = Target.the("Boton de registro").locatedBy("//a[@href='/login']");
    public static Target ELIMINAR_CUENTA = Target.the("Boton para eliminar cuneta").locatedBy("//a[@href='/delete_account']");
}
