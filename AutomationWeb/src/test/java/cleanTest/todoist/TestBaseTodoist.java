package cleanTest.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todo.Ly.LoginModal;
import pages.todo.Ly.MainPage;
import pages.todo.Ly.MenuSection;
import pages.todo.Ly.SettingsModal;
import pages.todoist.*;
import singletonSession.Session;

public class TestBaseTodoist {

    public MainPageTodoist mainPage=new MainPageTodoist();
    public LoginPage loginPage= new LoginPage();
    public CreateProjectModal createProjectModal= new CreateProjectModal();

    public UpdateProjectModal updateProjectModal = new UpdateProjectModal();

    public ConfirmationModal confirmationModal = new ConfirmationModal();

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
