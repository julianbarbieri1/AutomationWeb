package pages.ticktick;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {

    /*
    * Account and sec --> //span[text()='Account and Security']
Change password -->  //a[text()='Change Password']
currente pass textbox --> //div[@style='display: block;']//input[@placeholder='Current Password']
new pass textbox --> //div[@style='display: block;']//input[@placeholder='New password']
save button -->  //div[@class='btns leading-none']//button[text()='Save']*/

    public Button doneButton = new Button(By.xpath("//button[text()='Done']"));

    public Button accountSecurity = new Button(By.xpath("//span[text()='Account and Security']"));

    public Button changePassButton = new Button(By.xpath("//a[text()='Change Password']"));

    public TextBox currentPassTextbox = new TextBox(By.xpath("//div[@style='display: block;']//input[@placeholder='Current Password']"));

    public TextBox newPassTextbox = new TextBox(By.xpath("//div[@style='display: block;']//input[@placeholder='New password']"));

    public Button saveButton = new Button(By.xpath("//div[@class='btns leading-none']//button[text()='Save']"));
}