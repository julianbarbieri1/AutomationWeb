package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox= new TextBox(By.id("login"));

    public Button confirmationButton= new Button(By.xpath("//i[@class='material-icons-outlined f36']"));
}
