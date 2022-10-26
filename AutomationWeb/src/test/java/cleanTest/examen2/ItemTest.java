package cleanTest.examen2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.examen2.ItemsSeccion;

import java.util.Date;

public class ItemTest extends TestBaseTodoist{

    @Test
    public void verifyItemTest() throws InterruptedException {


        String email = "julian@julian.com";
        String password = "Barbieri99";
        String taskName = "Item 1";
        String taskNameUpdate = "Item 1 updated";

        //String newProjectName = "Julian " + new Date().getTime();


        //LOGIN

        loginPage.emailTextBox.setText(email);
        loginPage.passwordTextBox.setText(password);
        loginPage.loginButton.waitClickable();
        loginPage.loginButton.click();

        //Verificacion

        Assertions.assertTrue(menuPage.imgLogin.isControlDisplayed(),"ERROR!! no se pudo iniciar sesion");


        //SELECT PROJECT

        projectsSection.projectName.waitClickable();
        projectsSection.projectName.click();
        itemsSeccion.anadirTareaButton.click();

        //CREATE ITEM
        itemsSeccion.nombreTareaTextBox.addText(taskName);

        //due date
        itemsSeccion.dueDateButton.click();
        itemsSeccion.hoyDueDateButton.click();

        //priority
        itemsSeccion.priorityButton.click();
        itemsSeccion.priorityButton.waitClickable();
        itemsSeccion.priority1.click();

        //click añadir tarea button to create
        itemsSeccion.createItemButton.click();

        //Verificacion

        Assertions.assertTrue(itemsSeccion.itemExist(taskName),"ERROR!! no se pudo iniciar sesion");

        //UPDATE ITEM

        //itemsSeccion.getLastTaskByName(taskName).waitClickable();
        itemsSeccion.getLastTaskByName(taskName).click();
        Thread.sleep(2000);
        //updateSection.dueDateButton.waitClickable();
        updateSection.dueDateButton.click();
        updateSection.dueDateButtonSelected.click();
        Thread.sleep(2000);
        updateSection.prioridadButton.waitClickable();
        updateSection.prioridadButton.click();
        updateSection.prioridad2.click();

        updateSection.closeButton.click();

        Thread.sleep(3000);
    }
}
