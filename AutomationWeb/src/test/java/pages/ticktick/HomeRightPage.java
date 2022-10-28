package pages.ticktick;

import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class HomeRightPage {

    public TextBox inboxTextBox = new TextBox(By.xpath("//div[@class='CodeMirror-code']//pre[@class=' CodeMirror-line ' and @role='presentation']"));

}
