package com.automationexercise.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginRegisterUI {

    public static final Target NEW_USER_SIGNUP = Target.the("Mensaje New User Signup").locatedBy("//h2[text()='New User Signup!']");
    public static final Target NOMBRE = Target.the("Ingresar nombre").locatedBy("//input[@data-qa='signup-name']");
    public static final Target CORREO = Target.the("Ingresar correo").locatedBy("//input[@data-qa='signup-email']");
    public static final Target SIGN_UP_BTN = Target.the("Boton Sign Up").locatedBy("//button[@data-qa='signup-button']");
    public static final Target MR_CHECK = Target.the("Seleccion Mr").locatedBy("//*[@id=\"id_gender1\"]");
    public static final Target PASSWORD = Target.the("Ingresar contraseña").locatedBy("//input[@data-qa='password']");
    public static final Target DAY = Target.the("Ingresar contraseña").locatedBy("//select[@id='days']");
    public static final Target MONTH = Target.the("Ingresar contraseña").locatedBy("//select[@id='months']");
    public static final Target YEAR = Target.the("Ingresar contraseña").locatedBy("//select[@id='years']");
    public static final Target SELECCIONAR_NEWSLATTER = Target.the("Seleccionar News Letter").locatedBy("//input[@id='newsletter']");
    public static final Target SELECCIONAR_RECEIVE = Target.the("Seleccionar Receive").locatedBy("//input[@id='optin']");
    public static final Target INGRESAR_NOMBRE = Target.the("Seleccionar Receive").locatedBy("//input[@id='first_name']");
    public static final Target INGRESAR_APELLIDO = Target.the("Seleccionar Receive").locatedBy("//input[@id='last_name']");
    public static final Target INGRESAR_DIRECCION = Target.the("Seleccionar Receive").locatedBy("//input[@id='address1']");
    public static final Target SELECCIONAR_PAIS = Target.the("Seleccionar Receive").locatedBy("//select[@id='country']");
    public static final Target INGRESAR_ESTADO = Target.the("Seleccionar Receive").locatedBy("//input[@id='state']");
    public static final Target INGRESAR_CIUDAD = Target.the("Seleccionar Receive").locatedBy("//input[@id='city']");
    public static final Target INGRESAR_ZIPCODE = Target.the("Seleccionar Receive").locatedBy("//input[@id='zipcode']");
    public static final Target INGRESAR_TELEFONO = Target.the("Seleccionar Receive").locatedBy("//input[@id='mobile_number']");
    public static final Target REGISTRO_BTN = Target.the("Seleccionar registrar").locatedBy("//button[@data-qa='create-account']");



}
