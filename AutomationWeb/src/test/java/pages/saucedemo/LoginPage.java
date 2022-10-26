package pages.saucedemo;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox usernameTextBox = new TextBox(By.id("user-name"));

    public TextBox passwordTextBox = new TextBox(By.xpath("//input[@id='password']"));

    public Button loginButton = new Button(By.id("login-button"));
}
