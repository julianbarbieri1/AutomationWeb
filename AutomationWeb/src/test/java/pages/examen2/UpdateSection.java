package pages.examen2;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class UpdateSection {

    public Button closeButton = new Button(By.xpath("//button[@aria-label='Cerrar ventana']"));

    public Button dueDateButton = new Button(By.xpath("//button[@class='_3RuHnaq _9KUWmzz a8af2163 _98cd5c3f _352995bd f9408a0e _8c75067a' and @aria-expanded='false']"));

    public Button dueDateButtonSelected = new Button(By.xpath("//div[@class='scheduler-suggestions-item-label' and text()='Este fin de semana']"));

    public Button prioridadButton = new Button(By.xpath("//button[@class='_3RuHnaq a8af2163 _98cd5c3f _352995bd f9408a0e _56a651f6' and @aria-owns='dropdown-select-3-popup']"));

    public Button prioridad2 = new Button(By.xpath("//span[@class='priority_picker_item_name' and text()='Prioridad 2']"));

    public TextBox nameTextBox = new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
}
