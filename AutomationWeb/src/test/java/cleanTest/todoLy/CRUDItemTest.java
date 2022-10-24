package cleanTest.todoLy;

import org.junit.jupiter.api.Test;

public class CRUDItemTest extends TestBaseTodoLy {

    String newProject = "New Project";
    private String email = "pepe@pepe.com";
    private String pass = "pepe";
    private String item ="Item 1";

    /*public static String getNewProject(String newProject){
        return newProject;
    }*/

    @Test
    public void verifyCrudTest() {

        //LOGIN
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText(email);
        loginModal.passwordTextBox.setText(pass);
        loginModal.loginButton.click();

        //CREO PROYECTO

        projectsSection.addNewProjectButton.click();
        projectsSection.projectTextBox.setText(newProject);
        projectsSection.addProjButton.click();
        projectsSection.projectButton.click();

        //CREO ITEM
/*
        itemsSection.inputItemTextBox.setText(item);
        itemsSection.addItemButton.click();
*/
        //UPDATE ITEM



        //DELETE ITEM


        //verifico
        /*Assertions.assertEquals(newFullName, settingsModal.fullNameTextBox.getAttribute("value"),
                "ERROR full name was not successfully changed");
*/
    }


}
