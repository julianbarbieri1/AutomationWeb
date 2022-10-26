package pages.examen2;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox = new TextBox(By.id("element-0"));
    public TextBox passwordTextBox = new TextBox(By.id("element-3"));
    public Button loginButton = new Button(By.xpath("//button[@class='nFxHGeI S7Jh9YX a8af2163 _3d1243b2 _3991076f f9408a0e _8c75067a']"));
}
