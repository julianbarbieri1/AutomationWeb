package pages.juiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage2 {

    public Button popUpWelcome = new Button(By.xpath("//button[@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']"),
            "[popUpWelcome] button in main page");

    public Button accountNavBarButton = new Button(By.id("navbarAccount"),
            "[accountNavBar] button in main page");

    public Button loginNavBarButton = new Button(By.id("navbarLoginButton"),
            "[navbarLoginButton] button in main page");

    public Button cartButton = new Button(By.xpath("//button[@class='mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted']"),
            "[Cart] button in main page");

}
