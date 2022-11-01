package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage2 {

    public Button notYetCustomerButton = new Button(By.xpath("//a[@class='primary-link']"),
            "[NotYetCustomer] button in login page");

    public Label loginLabel = new Label(By.xpath("//h1[text()='Login']"), "[Login] label in login page");

    public TextBox emailTextBox = new TextBox(By.id("email"),
            "[Email] TextBox in login page");
    public TextBox passTextBox = new TextBox(By.id("password"),
            "[Password] TextBox in login page");
    public Button loginButton = new Button(By.id("loginButton"), "[Login] button in login page");

}
