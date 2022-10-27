package cleanTest.juiceShop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AccountTest extends TestBaseJuiceShop{

    @Test
    public void verifyAccountTest() throws InterruptedException {

        String email = "pepe"+new Date().getTime() +"@pepe.com";
        String pass = "Pepe,1234";
        String question = " Paternal grandmother's first name? ";
        String answer = "soledad";

        //REGISTER
        mainPage.popUp1.click();
        mainPage.accountButton.click();
        mainPage.logginButton.click();
        loginPage.notYetCustomerButton.click();

        //ingresa datos

        registerPage.emailTextBox.addText(email);
        registerPage.passTextBox.addText(pass);
        registerPage.repeatPassTextBox.addText(pass);
        registerPage.securityQuestionButton.click();
        registerPage.getQuestionSelected(question).click();
        registerPage.answerQuestionTextBox.addText(answer);
        registerPage.registerButton.click();

        //LOGIN
        loginPage.emailTextBox.addText(email);
        loginPage.passTextBox.addText(pass);
        loginPage.loginButton.click();

        Assertions.assertTrue(mainPage.cartLabel.isControlDisplayed(),"ERROR!! no se pudo iniciar sesion");

        //LOGOUT
        mainPage.accountButton.click();
        mainPage.logoutButton.click();

        Assertions.assertFalse(mainPage.cartLabel.isControlDisplayed(),"ERROR!! no se pudo hacer el logout");


        Thread.sleep(3000);


    }
}
