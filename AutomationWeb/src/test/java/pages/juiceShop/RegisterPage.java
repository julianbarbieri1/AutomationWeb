package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class RegisterPage {

    public TextBox emailTextBox = new TextBox(By.id("emailControl"));

    public TextBox passTextBox = new TextBox(By.id("passwordControl"));

    public TextBox repeatPassTextBox = new TextBox(By.id("repeatPasswordControl"));

    public Button securityQuestionButton = new Button(By.xpath("//div[@class=\"security-container\"]/mat-form-field[@class]\""));

    public Button getQuestionSelected(String question)
    {
        Button selectedQuestion = new Button(By.xpath("//span[@class='mat-option-text' and text()='"+ question +"']"));
        return selectedQuestion;
    }

    public TextBox answerQuestionTextBox = new TextBox(By.id("securityAnswerControl"));
    public Button registerButton = new Button(By.id("registerButton"));

}
