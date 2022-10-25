package cleanTest.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.yopmail.LoginPage;
import pages.yopmail.MainPage;
import singletonSession.Session;

public class TestBaseYopmail {

    public LoginPage loginPage = new LoginPage();
    public MainPage mainPage = new MainPage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://yopmail.com/en/");
        }


    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }


}
