package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TickTickHabitTest extends TestBaseTickTick {

    String name = "Julian";
    String user = getAlphaNumericString(6)+"@gmail.com";
    String password = getAlphaNumericString(6);
    String habit = getAlphaNumericString(6);
    @Test
    public void verifyCreateHabitTest() throws InterruptedException {

        //CREATE NEW ACCOUNT
        mainPage.signUpForFreeButton.click();

        registerPage.nicknameTextBox.addText(name);
        registerPage.emailTextBox.addText(user);
        registerPage.passTextBox.addText(password);
        registerPage.signUpButton.click();

        //verificacion

        homePage.logoUser.waitVisibility();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude registrar el usuario");

        //go to habits
        homePage.skipButton.click();
        homePage.habitButton.click();

        //create habit
        habitSection.addHabit.click();
        habitSection.addHabitTextBox.addText(habit);
        habitSection.saveButton.click();

        Assertions.assertTrue(habitSection.habitExist(habit), "ERROR, no se pudo crear el habito");

    }
}