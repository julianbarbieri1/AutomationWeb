package pages.todoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CreateProjectModal {
    public TextBox projectNameTextBox= new TextBox(By.xpath("//input[@aria-describedby='edit_project_modal_field_name_hint']"));
    public Button addButton= new Button(By.xpath("//button[@class='ist_button ist_button_red']"));
}
