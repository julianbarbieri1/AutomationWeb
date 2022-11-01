package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

public class RegisterPage2 {

////input[@id='emailControl']
public TextBox emailTextBox = new TextBox(By.id("emailControl"), "[Email] text box in register page");
public TextBox passTextBox = new TextBox(By.id("passwordControl"), "[Password] text box in register page");
    public TextBox repeatPassTextBox = new TextBox(By.id("repeatPasswordControl"), "[RepeatPassword] text box in register page");

    public Button securityQuestionComboBox = new Button(By.xpath("//div[@class=\"security-container\"]/mat-form-field[@class]"),
            "[Security question] ComboBox in register page");

    public Button registerButton = new Button(By.id("registerButton"),"[RegisterButton] button in register page");

    public TextBox securityAnswerTxtBox = new TextBox(By.id("securityAnswerControl"), "[securityAnswerTextBox] text box in register page");
    //3 a 16
    public Button selectSecurityQuestion(int position){
        Button selectBtn = new Button(By.id("mat-option-" + (position+2)), "[Security question] item in register page");
        return selectBtn;
    }
}
