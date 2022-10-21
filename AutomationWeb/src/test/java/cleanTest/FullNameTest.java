package cleanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.todo.Ly.SettingsModal;

import java.util.Date;

public class FullNameTest extends TestBaseTodoLy{

    @Test
    public void verifyFullNameTest() throws InterruptedException {

        String newFullName = "new full name" + new Date().getTime();

        //LOGIN
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText("pepe@pepe.com");
        loginModal.passwordTextBox.setText("pepe");
        loginModal.loginButton.click();

        //CHANGE FULL NAME
        menuSection.settingsButton.click();
        settingsModal.fullNameTextBox.setText(newFullName);
        settingsModal.okButton.click();
        menuSection.settingsButton.click();

        String expectedResult = newFullName;

        //VERIFY
        Assertions.assertEquals(newFullName, settingsModal.fullNameTextBox.getAttribute("value"),
                "ERROR full name was not successfully changed");

    }

}
