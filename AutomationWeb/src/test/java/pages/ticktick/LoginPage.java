package pages.ticktick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox = new TextBox(By.id("emailOrPhone"));

    public TextBox passTextBox = new TextBox(By.id("password"));

    public Button signInButton = new Button(By.xpath("//button[@class='button__3eXSs ']"));
}
