package cleanTest.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.ticktick.HomePage;
import pages.ticktick.LoginPage;
import pages.ticktick.MainPage;
import pages.ticktick.RegisterPage;
import singletonSession.Session;

public class TestBaseTickTick {

    public LoginPage loginPage = new LoginPage();
    public RegisterPage registerPage = new RegisterPage();

    public MainPage mainPage = new MainPage();

    public HomePage homePage = new HomePage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://ticktick.com/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
