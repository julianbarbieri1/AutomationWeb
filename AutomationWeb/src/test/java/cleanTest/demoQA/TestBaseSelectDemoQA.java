package cleanTest.demoQA;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.demoQA.SelectableSection;
import pages.examen2.LoginPage;
import singletonSession.Session;

public class TestBaseSelectDemoQA {

    public SelectableSection selectableSection = new SelectableSection();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://demoqa.com/selectable");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
