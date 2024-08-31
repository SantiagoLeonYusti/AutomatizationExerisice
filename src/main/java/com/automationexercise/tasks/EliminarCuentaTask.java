package com.automationexercise.tasks;

import com.automationexercise.ui.CuentaeliinadaUI;
import com.automationexercise.ui.RegistroCreadoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.automationexercise.ui.PaginaPrincipalUI.ELIMINAR_CUENTA;
import static com.automationexercise.ui.RegistroCreadoUI.LOGIN_BTN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarCuentaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BTN),
                Click.on(ELIMINAR_CUENTA)
        );
        actor.should(seeThat(WebElementQuestion.the(CuentaeliinadaUI.CUENTA_ELIMINADA), isVisible()));
    }

    public static EliminarCuentaTask on() {
        return instrumented(EliminarCuentaTask.class);
    }
}
