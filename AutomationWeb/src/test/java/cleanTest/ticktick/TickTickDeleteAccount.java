package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TickTickDeleteAccount extends TestBaseTickTick {

    String name = "Julian";
    String user = getAlphaNumericString(6)+"@gmail.com";
    String password = getAlphaNumericString(6);
    @Test
    public void verifyDeleteAccountTest() throws InterruptedException {

        //create account

        //CREATE NEW ACCOUNT
        mainPage.signUpForFreeButton.click();

        registerPage.nicknameTextBox.addText(name);
        registerPage.emailTextBox.addText(user);
        registerPage.passTextBox.addText(password);
        registerPage.signUpButton.click();

        //verificacion

        homePage.logoUser.waitVisibility();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude registrar el usuario");

        //GO TO SETTINGS ccount security
        homePage.skipButton.click();
        homePage.logoUser.click();
        homePage.settingsButton.click();
        settingsSection.accountSecurity.click();

        //DELETE ACCOUNT

        settingsSection.deleteButton.click();
        settingsSection.deletePasswordTextBox.addText(password);

        settingsSection.deleteCheckBoxAccount.check();
        settingsSection.deleteCheckBoxData.check();
        settingsSection.deleteConfirmButton.click();

        //inicio sesion
        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(user);
        loginPage.passTextBox.addText(password);
        loginPage.signInButton.click();

        Assertions.assertFalse(homePage.logoUser.isControlDisplayed(), "ERROR, no se pudo eliminar la cuenta");



    }
}