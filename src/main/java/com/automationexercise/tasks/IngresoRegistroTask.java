package com.automationexercise.tasks;

import com.automationexercise.ui.LoginRegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


import static com.automationexercise.ui.PaginaPrincipalUI.REGISTRO_BTN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;



public class IngresoRegistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REGISTRO_BTN)
        );
        actor.should(seeThat(WebElementQuestion.the(LoginRegisterUI.NEW_USER_SIGNUP), isVisible()));


    }

    public static IngresoRegistroTask on() {
        return instrumented(IngresoRegistroTask.class);
    }
}
