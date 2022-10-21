package pages.todo.Ly;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SettingsModal {

    public TextBox fullNameTextBox = new TextBox(By.id("FullNameInput"));

    public Button okButton = new Button(By.xpath(" //span[text()='Ok']"));

}
