package pages.ticktick;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class HomePage {

    public Button inboxButton = new Button(By.xpath("//button[@class='project-list-view-item-button drop-hover-effect px-[12px] relative h-full rounded-default flex items-center cursor-pointer group overflow-hidden text-left w-full bg-primary-10 dark:bg-grey-20']"));

    public Button buttonSelectedActions = new Button(By.xpath("//button[@data-selected='true']//div[@class='flex-none flex items-center min-w-[24px] justify-end relative z-0']"));
    public Button logoUser = new Button(By.xpath("//div[@class='relative h-full w-full cursor-pointer']"));

    public Button logOut = new Button(By.xpath("//ul[@class='dropdown-menu-menu dropdown-menu-menu-root dropdown-menu-menu-vertical']//li[last()]"));
public Button settingsButton = new Button(By.xpath("//span[text()='Settings']"));
    public Button skipButton = new Button(By.xpath("//span[text()='Skip']"));
    public Button TodayButton = new Button(By.xpath("//div[@class='h-full']//button[@class='project-list-view-item-button drop-hover-effect px-[12px] relative h-full rounded-default flex items-center cursor-pointer group overflow-hidden text-left w-full bg-primary-10 dark:bg-grey-20']"));
}
