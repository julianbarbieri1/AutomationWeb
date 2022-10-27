package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public Button notYetCustomerButton = new Button(By.id("newCustomerLink"));

    public TextBox emailTextBox = new TextBox(By.id("email"));

    public TextBox passTextBox = new TextBox(By.id("password"));

    public Button loginButton = new Button(By.id("loginButton"));

}
