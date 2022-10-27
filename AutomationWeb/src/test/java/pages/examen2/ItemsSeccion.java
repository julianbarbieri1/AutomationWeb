package pages.examen2;

import controlSelenium.Button;
import controlSelenium.CheckBox;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class ItemsSeccion {

    public Button items = new Button(By.xpath("//ul[@class=\"items\"]/li"));

    public Button anadirTareaButton = new Button(By.xpath("//button[@class='plus_add_button']"));

    public TextBox nombreTareaTextBox = new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));

    public Button dueDateButton = new Button(By.xpath("//span[@class='item_due_selector_text']"));

    public Button hoyDueDateButton = new Button(By.xpath("//button[@class='scheduler-suggestions-item' and @data-track='scheduler|date_shortcut_tomorrow']"));

    public Button priorityButton = new Button(By.xpath("//button[@aria-label='Establecer prioridad']"));

    public Button priority1 = new Button(By.xpath("//li[@aria-label='Prioridad 1']"));
    public Button priority2 = new Button(By.xpath("//li//span[text()='Prioridad 2']"));
    public Button priority3 = new Button(By.xpath("//li//span[text()='Prioridad 3']"));
    public Button priority4 = new Button(By.xpath("//li//span[text()='Prioridad 4']"));

    public Button createItemButton = new Button(By.xpath("//button[@class='a8af2163 _3d1243b2 _352995bd f9408a0e _56a651f6']"));

    public boolean itemExist(String name){
        Label itemName= new Label(By.xpath("//div[last()]//div[@class='markdown_content task_content' and text()='"+name+"']"));
        return (itemName.isControlDisplayed());

    }

    public Button getLastTaskByName(String taskName)
    {
        Button selectedTask = new Button(By.xpath("//ul//li[last()]//li[@aria-selected=\"false\"][last()]//div[@class='markdown_content task_content' and text()='"+taskName+"']"));

        return selectedTask;
    }

}
