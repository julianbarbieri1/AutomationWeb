package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TickTickHabitTest extends TestBaseTickTick {

    String email = "j@j.com";
    String pass2 = "123456";

    String habit = "cjbd";

    @Test
    public void verifyCreateHabitTest() throws InterruptedException {

        //inicio sesion
        mainPage.signInButton.click();

        loginPage.emailTextBox.addText(email);
        loginPage.passTextBox.addText(pass2);
        loginPage.signInButton.click();

        homePage.logoUser.waitClickable();
        Assertions.assertTrue(homePage.logoUser.isControlDisplayed(), "ERROR, no se pude iniciar sesion");

        //go to habits

        homePage.habitButton.click();
        habitSection.addHabit.click();
        habitSection.addHabitTextBox.addText(habit);
        habitSection.saveButton.click();

        Assertions.assertTrue(habitSection.habitExist(habit), "ERROR, no se pudo crear el habito");
        Thread.sleep(3000);
    }
}