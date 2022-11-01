package cleanTest.juiceShop;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.juiceShop.*;
import singletonSession.Session;

public class TestBaseJuiceShop {

    public LoginPage loginPage = new LoginPage();

    public MainPage mainPage = new MainPage();

    public RegisterPage registerPage = new RegisterPage();

    public MainPage2 mainPage2 = new MainPage2();
    public LoginPage2 loginPage2 = new LoginPage2();
    public RegisterPage2 registerPage2 = new RegisterPage2();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://juiceshop-nybbleacm-service-julianbarbieri1.cloud.okteto.net/#/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

    static String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

}
