package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class MainPage {


    public Button refreshButton = new Button(By.xpath("//button[@id='refresh']"));
    public Button newEmailButton = new Button(By.id("newmail"));

    public TextBox sendToTextBox= new TextBox(By.xpath("//input[@id='msgto']"));
    public TextBox subjectTextBox= new TextBox(By.xpath("//input[@id='msgsubject']"));
    public TextBox emailBodyTextBox= new TextBox(By.xpath("//div[@id='msgbody']"));

    public Button sendButton= new Button(By.xpath("//button[@id='msgsend']"));


    public boolean emailExist(String email, String subject){

        Label emailReceived = new Label(By.xpath("//span[text()='"+email+"' and @class='lmf']"));
        Label subjectReceived = new Label(By.xpath("//div[text()='"+subject+"' and @class='lms']"));
        if(emailReceived.isControlDisplayed() && subjectReceived.isControlDisplayed())
            return true;
        else
            return false;
    }

    public boolean emailSend(){

        Label emailSend = new Label(By.xpath("//div[@id='msgpopmsg']"));
        emailSend.waitTextToBePresent(emailSend.getText());
        if(emailSend.isControlDisplayed())
            return true;
        else
            return false;
    }
}
