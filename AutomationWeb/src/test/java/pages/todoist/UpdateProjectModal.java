package pages.todoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class UpdateProjectModal {

    public Button saveButton = new Button(By.xpath("//button[text()='Guardar']"));

    public TextBox nameTextBox = new TextBox(By.xpath("//input[@aria-describedby='edit_project_modal_field_name_hint']"));

}
