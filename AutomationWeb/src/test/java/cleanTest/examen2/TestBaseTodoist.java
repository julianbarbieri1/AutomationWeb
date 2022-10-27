package cleanTest.examen2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import pages.examen2.*;
import pages.todoist.ConfirmationModal;
import singletonSession.Session;

public class TestBaseTodoist {

    public DeleteSection deleteSection = new DeleteSection();
    public UpdateSection updateSection = new UpdateSection();
    public ItemsSeccion itemsSeccion = new ItemsSeccion();

    public ProjectsSection projectsSection = new ProjectsSection();

    public MenuPage menuPage = new MenuPage();

    public LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://todoist.com/auth/login");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
