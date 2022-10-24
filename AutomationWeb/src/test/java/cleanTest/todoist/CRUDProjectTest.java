package cleanTest.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDProjectTest extends TestBaseTodoist{

    @Test
    public void verifyCrudTest() throws InterruptedException {

        //LOGIN

        String email = "julian@julian.com";
        String password = "Barbieri99";
        String projectName = "Julian";
        String newProjectName = "Julian " + new Date().getTime();

        //LOGIN
        loginPage.emailTextBox.setText(email);
        loginPage.passwordTextBox.setText(password);
        loginPage.loginButton.click();

        Thread.sleep(5000);

        //CREATE PROJECT (NO FUNCIONA)
        mainPage.addProjectButton.click();
        createProjectModal.projectNameTextBox.setText(projectName);
        createProjectModal.addButton.click();



        //UPDATE
        mainPage.masProyectosButton.click();
        mainPage.editarButton.click();
        updateProjectModal.nameTextBox.setText(newProjectName);
        updateProjectModal.saveButton.click();


        //DELETE
        mainPage.masProyectosButton.click();
        mainPage.eliminarButton.click();
        confirmationModal.confirmationButton.click();

        Thread.sleep(5000);

        //VERIFICATION
        Assertions.assertEquals(newProjectName, updateProjectModal.nameTextBox.getText(),
                "ERROR project was not successfully deleted");


    }
}
