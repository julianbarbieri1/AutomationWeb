package cleanTest.yopmail;

import controlSelenium.Control;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class MailTest extends TestBaseYopmail{

    @Test
    public void verifyMailTest() throws InterruptedException {
        String email = "julian"+new Date().getTime();
        String emailRecibido = email + "@yopmail.com";
        String subject = "subject";
        String body = "body";
        //LOGIN
        loginPage.emailTextBox.setText(email);
        loginPage.confirmationButton.click();

        //SEND EMAIL

        mainPage.newEmailButton.click();
        Session.getInstance().getBrowser().switchTo().frame("ifmail");

        mainPage.sendToTextBox.setText(emailRecibido);
        mainPage.subjectTextBox.setText(subject);
        mainPage.emailBodyTextBox.setText(body);
        mainPage.sendButton.click();
        mainPage.sendButton.waitClickable();
        
        //Thread.sleep(2000);
        //VERIFICACION
        Assertions.assertTrue(mainPage.emailSend(),"ERROR no se envio el mail");


        //REFRESH
        Session.getInstance().getBrowser().switchTo().defaultContent();

        mainPage.refreshButton.click();
        mainPage.refreshButton.waitClickable();

        Session.getInstance().getBrowser().switchTo().frame("ifinbox");

        //VERIFICACION
        Assertions.assertTrue(mainPage.emailExist(emailRecibido,subject),"ERROR no se recibio el mail");


    }
}
