package cleanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.todo.Ly.SettingsModal;

import java.util.Date;

public class FullNameTest extends TestBaseTodoLy{

    @Test
    public void verifyFullNameTest(){

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

        String actualResult = driver.findElement(By.id("FullNameInput")).getAttribute("value");
        String expectedResult = newFullName;

        //VERIFY
        Assertions.assertEquals(settingsModal.fullNameTextBox.getAttribute(newFullName),
                "ERROR full name was not successfully changed");

    }

}
