package cleanTest.demoQA;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.demoQA.IframeSection;
import pages.examen2.LoginPage;
import singletonSession.Session;

public class TestBaseIframeDemoQA {

    public IframeSection iframeSection = new IframeSection();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://demoqa.com/frames");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
