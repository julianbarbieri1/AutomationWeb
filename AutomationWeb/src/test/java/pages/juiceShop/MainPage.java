package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Button popUp1 = new Button(By.xpath("//span[text()='Dismiss']"));

    public Button accountButton = new Button(By.id("navbarAccount"));

    public Button logginButton = new Button(By.id("navbarLoginButton"));

    public Button menuButton = new Button(By.xpath("//button[@aria-label='Open Sidenav']"));

    public Label cartLabel = new Label(By.xpath("//button[@routerlink='/basket']"));

    public Button logoutButton = new Button(By.id("navbarLogoutButton"));

}
