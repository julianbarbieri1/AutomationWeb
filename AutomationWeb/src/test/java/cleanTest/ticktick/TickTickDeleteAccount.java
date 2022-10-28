package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TickTickDeleteAccount extends TestBaseTickTick {

    String email = "j@j.com";
    String pass2 = "123456";


    /*String user = getAlphaNumericString(6)+"@gmail.com";
    String password = getAlphaNumericString(6);*/
    @Test
    public void verifyDeleteAccountTest() throws InterruptedException {

        //create account
/*
        //CREATE NEW ACCOUNT
        mainPage.signUpForFreeButton.click();

        registerPage.nicknameTextBox.addText(name);
        registerPage.emailTextBox.addText(email);
        registerPage.passTextBox.addText(pass1);
        registerPage.signUpButton.click();

        //verificacion

        homePage.logoUser.waitVisibility();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude registrar el usuario");
        */


        //inicio sesion
        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(email);
        loginPage.passTextBox.addText(pass2);
        loginPage.signInButton.click();

        homePage.logoUser.waitClickable();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude iniciar sesion");

        //GO TO SETTINGS ccount security
        homePage.logoUser.click();
        homePage.settingsButton.click();
        settingsSection.accountSecurity.click();

        //DELETE ACCOUNT

        settingsSection.deleteButton.click();
        settingsSection.deletePasswordTextBox.addText(pass2);

        settingsSection.deleteCheckBoxAccount.check();
        settingsSection.deleteCheckBoxData.check();
        settingsSection.deleteConfirmButton.click();

        //inicio sesion
        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(email);
        loginPage.passTextBox.addText(pass2);
        loginPage.signInButton.click();

        homePage.logoUser.waitClickable();
        Assertions.assertFalse(homePage.logoUser.isControlDisplayed(), "ERROR, no se pudo eliminar la cuenta");



    }
}