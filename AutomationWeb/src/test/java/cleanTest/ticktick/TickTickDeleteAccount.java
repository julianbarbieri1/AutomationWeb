package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TickTickDeleteAccount extends TestBaseTickTick {

    String name = "Julian";
    String user = getAlphaNumericString(6)+"@gmail.com";
    String password = getAlphaNumericString(6);
    @Test
    public void verifyDeleteAccountTest() throws InterruptedException {

        //CREATE NEW ACCOUNT
        mainPage.signUpForFreeButton.click();

        registerPage.signUpButton.waitVisibility();
        //set name
        registerPage.nicknameTextBox.addText(name);
        //set email
        registerPage.emailTextBox.addText(user);
        //set password
        registerPage.passTextBox.addText(password);
        //click sign up button
        registerPage.signUpButton.click();

        //verificacion si el logo user esta desplegado

        homePage.logoUser.waitVisibility();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude registrar el usuario");

        //GO TO SETTINGS Account security
        homePage.skipButton.click();

        //click on logo button
        homePage.logoUser.click();
        //click settings button
        homePage.settingsButton.click();
        //WAIT CON EL LABEL "Settings"
        settingsSection.accountSecurity.waitVisibility();
        //click account security button
        settingsSection.accountSecurity.click();

        //DELETE ACCOUNT
        //click delete button
        settingsSection.deleteButton.click();
        //set password
        settingsSection.deletePasswordTextBox.addText(password);
        //check checkboxes
        settingsSection.deleteCheckBoxAccount.check();
        settingsSection.deleteCheckBoxData.check();
        //click ok button
        settingsSection.deleteConfirmButton.click();


        //INICIO SESION
        //click sign in button
        mainPage.signInButton.click();
        //set email
        loginPage.emailTextBox.addText(user);
        //set password
        loginPage.passTextBox.addText(password);
        //click sign in button
        loginPage.signInButton.click();

        Assertions.assertFalse(homePage.logoUser.isControlDisplayed(), "ERROR, no se pudo eliminar la cuenta");



    }
}