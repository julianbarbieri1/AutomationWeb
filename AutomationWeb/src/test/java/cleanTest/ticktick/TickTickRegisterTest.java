package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TickTickRegisterTest extends TestBaseTickTick {

    String name = "Julian";
    String email = "julian"+new Date().getTime() + "@j.com";
    String pass = "Julian1234";

    @Test
    public void verifyRegisterTest() throws InterruptedException {

        mainPage.signUpForFreeButton.click();

        registerPage.nicknameTextBox.addText(name);
        registerPage.emailTextBox.addText(email);
        registerPage.passTextBox.addText(pass);
        registerPage.signUpButton.click();

        //verificacion

        homePage.logoUser.waitVisibility();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude registrar el usuario");

    }

}