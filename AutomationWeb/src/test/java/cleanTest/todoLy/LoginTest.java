package cleanTest.todoLy;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.GetProperties;

public class LoginTest extends TestBaseTodoLy{
    @Test
    @DisplayName("verify Login Successfully")
    @Description("Test login")
    @Owner("Julian")
    @Link("www.jira.com/0001")
    @Issue("www.jira.com/bug001")
    @Lead("Testttttt")
    @Epic("Login")
    @Feature("Authentication")
    @Story("Story login")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyLoginSuccessfully(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText(GetProperties.getInstance().getUser());
        loginModal.passwordTextBox.setText(GetProperties.getInstance().getPwd());
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");

    }


}
