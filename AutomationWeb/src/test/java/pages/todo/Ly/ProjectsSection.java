package pages.todo.Ly;

import cleanTest.CRUDItemTest;
import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class ProjectsSection {


    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));

    public TextBox projectTextBox = new TextBox(By.id("NewProjNameInput"));

    public Button addProjButton = new Button(By.id("NewProjNameButton"));

    //public Button projectButton = new Button(By.xpath("//li[last()]//td[text()='"+ CRUDItemTest.getNewProject() + "']"));
}
