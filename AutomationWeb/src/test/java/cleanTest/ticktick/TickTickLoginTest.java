package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TickTickLoginTest extends TestBaseTickTick {

    String email="j@j.com";
    String pass ="Julian1234";

    @Test @Order(1)
    public void verifyLoginTest() throws InterruptedException {

        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(email);
        loginPage.passTextBox.addText(pass);
        loginPage.signInButton.click();

        homePage.logoUser.waitClickable();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude iniciar sesion");

    }
    @Test @Order(2)
    public void verifyLogoutTest() throws InterruptedException {

        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(email);
        loginPage.passTextBox.addText(pass);
        loginPage.signInButton.click();

        homePage.logoUser.waitClickable();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude iniciar sesion");

        //LOG OUT

        homePage.logoUser.click();
        homePage.logOut.click();

        Assertions.assertFalse(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude iniciar sesion");

    }

}