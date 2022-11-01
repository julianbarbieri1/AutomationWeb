package cleanTest.juiceShop;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBaseJuiceShop{

    @Test
    @DisplayName("verify register Successfully")
    @Description("Test register")
    @Owner("Julian")
    public void verifyRegisterTest() throws InterruptedException {

        String email = getAlphaNumericString(6)+"@gmail.com";
        String password = getAlphaNumericString(6);
        String securityAns = getAlphaNumericString(10);

        //MAIN PAGE
        mainPage2.popUpWelcome.waitClickable();
        mainPage2.popUpWelcome.click();
        //mainPage2.accountNavBarButton.waitClickable();
        //mainPage2.accountNavBarButton.click();
        mainPage2.loginNavBarButton.click();

        Thread.sleep(3000);
        //LOGIN PAGE
        loginPage2.notYetCustomerButton.click();

        //REGISTER PAGE
        registerPage2.emailTextBox.addText(email);
        registerPage2.passTextBox.addText(password);
        registerPage2.repeatPassTextBox.addText(password);
        registerPage2.securityQuestionComboBox.click();
        registerPage2.selectSecurityQuestion(1).waitPresence();
        registerPage2.selectSecurityQuestion(1).waitVisibility();
        registerPage2.selectSecurityQuestion(1).click();
        registerPage2.securityAnswerTxtBox.setText(securityAns);
        registerPage2.registerButton.click();

        //verifico
        loginPage2.loginLabel.waitVisibility();
        Assertions.assertTrue(loginPage2.loginLabel.isControlDisplayed(),"ERROR user was not registered");

        //LOGIN DEL USUARIO

        loginPage2.emailTextBox.addText(email);
        loginPage2.passTextBox.addText(password);
        loginPage2.loginButton.click();

        mainPage2.cartButton.waitClickable();
        Assertions.assertTrue(mainPage2.cartButton.isControlDisplayed(),"ERROR user was not log in");

    }
}