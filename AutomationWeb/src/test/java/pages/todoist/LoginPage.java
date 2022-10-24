package pages.todoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox= new TextBox(By.xpath("//input[@id='element-0']"));

    public TextBox passwordTextBox= new TextBox(By.xpath("//input[@id='element-3']"));

    public Button loginButton= new Button(By.xpath("//button[@type='submit']"));
}
