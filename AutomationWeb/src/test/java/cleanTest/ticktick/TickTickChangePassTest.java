package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TickTickChangePassTest extends TestBaseTickTick{

    String name = "Julian";
    String email = "j@j.com";
    //String email = "julian"+new Date().getTime() + "@j.com";
    String pass = "Julian1234";
    String pass1 ="Julian1234";
    String pass2 ="123456";
    String user = getAlphaNumericString(6)+"@gmail.com";


    @Test
    public void verifyChangePasswordTest() throws InterruptedException {


        //CREATE NEW ACCOUNT
        mainPage.signUpForFreeButton.click();

        registerPage.nicknameTextBox.addText(name);
        registerPage.emailTextBox.addText(user);
        registerPage.passTextBox.addText(pass1);
        registerPage.signUpButton.click();

        //verificacion

        homePage.logoUser.waitVisibility();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude registrar el usuario");

        //GO TO SETTINGS
        //Thread.sleep(2000);
        homePage.skipButton.click();
        //Thread.sleep(2000);
        homePage.logoUser.click();
        //Thread.sleep(2000);
        homePage.settingsButton.click();

        //CHANGE PASSWORD

        settingsSection.accountSecurity.click();
        settingsSection.changePassButton.click();
        settingsSection.currentPassTextbox.addText(pass1);
        settingsSection.newPassTextbox.addText(pass2);
        settingsSection.saveButton.click();
        settingsSection.doneButton.click();

        //Verfico haciendo logout e iniciando con la nueva contraseña
        homePage.logoUser.waitClickable();
        homePage.logoUser.click();
        homePage.logOut.click();

        Assertions.assertFalse(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude cerrar sesion");

        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(user);
        loginPage.passTextBox.addText(pass2);
        loginPage.signInButton.click();

        homePage.logoUser.waitClickable();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude iniciar sesion");


    }

}
