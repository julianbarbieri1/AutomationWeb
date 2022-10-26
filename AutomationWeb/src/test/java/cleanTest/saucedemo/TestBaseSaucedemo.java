package cleanTest.saucedemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.saucedemo.LoginPage;
import pages.saucedemo.MainPage;
import pages.saucedemo.CartSection;
import singletonSession.Session;

public class TestBaseSaucedemo {

    public LoginPage loginPage = new LoginPage();

    public MainPage mainPage = new MainPage();

    public CartSection cartSection = new CartSection();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://www.saucedemo.com/");
    }


    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }


}
