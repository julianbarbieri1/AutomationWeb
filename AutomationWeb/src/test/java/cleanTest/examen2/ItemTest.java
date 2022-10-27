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
        int numberOfItemsBefore = itemsSeccion.items.findControls();

        //Verificacion

        Assertions.assertTrue(itemsSeccion.itemExist(taskName),"ERROR!! no se pudo crear el item");

        //UPDATE ITEM

        itemsSeccion.getLastTaskByName(taskName).click();
        updateSection.ClosePopUpButton1.click();
        updateSection.closePopUpButton2.click();
        updateSection.dueDateButton.click();
        updateSection.dueDateButtonSelected.click();
        updateSection.prioridadButton.click();
        updateSection.prioridad2.click();
        updateSection.closeButton.click();



       /* String actualResult = updateSection.dueDateButtonSelected.getAttribute("value");
        String expectedResult =  itemsSeccion.hoyDueDateButton.getAttribute("value");
        Assertions.assertNotEquals(actualResult,expectedResult,"ERROR, no se actualizo el item");
*/
        //DELETE ITEM

        itemsSeccion.getLastTaskByName(taskName).click();
        deleteSection.masAccionesButton.click();
        deleteSection.eliminarButton.waitClickable();
        deleteSection.eliminarButton.click();
        deleteSection.confirmationButton.waitClickable();
        deleteSection.confirmationButton.click();

        //VERIFICACION

        int numberOfItemsAfter = itemsSeccion.items.findControls();
        Assertions.assertNotEquals(numberOfItemsBefore,numberOfItemsAfter,"ERROR, el item no fue eliminado");

        Thread.sleep(3000);
    }
}
