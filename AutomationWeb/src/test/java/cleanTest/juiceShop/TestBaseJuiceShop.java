package cleanTest.juiceShop;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.juiceShop.LoginPage;
import pages.juiceShop.MainPage;
import pages.juiceShop.RegisterPage;
import singletonSession.Session;

public class TestBaseJuiceShop {

    public LoginPage loginPage = new LoginPage();

    public MainPage mainPage = new MainPage();

    public RegisterPage registerPage = new RegisterPage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("http://localhost:3000/#/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }


}
