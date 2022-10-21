package pages.todo.Ly;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ItemsSection {

    public TextBox inputItemTextBox = new TextBox(By.id("NewItemContentInput"));

    public Button addItemButton = new Button(By.id("NewItemAddButton"));

   // public Button itemCreatedButton = new Button();
 /*   //click on item created //li[last()]//div[text()='Item']
        driver.findElement(By.xpath("//li[last()]//div[text()='" + itemName + "']")).click();

    //clear
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).clear();

    // textarea[@id='ItemEditTextbox']
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys(newItemName + Keys.ENTER);
*/


}
