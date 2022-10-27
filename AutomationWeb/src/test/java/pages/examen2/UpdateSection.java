package pages.examen2;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class UpdateSection {

    public Button ClosePopUpButton1 = new Button(By.xpath("//button[@class='lY85SI192N7chlxbtFB6DA==']"));
    public Button closePopUpButton2 = new Button(By.xpath("//button[@class='lY85SI192N7chlxbtFB6DA==']"));

    public Button closeButton = new Button(By.xpath("//button[@aria-label='Cerrar ventana']"));

    public Button dueDateButton = new Button(By.xpath("//div[text()=\"Fecha de vencimiento\"]/following-sibling::div//button"));

    public Button dueDateButtonSelected = new Button(By.xpath("//div[@class='scheduler-suggestions-item-label' and text()='Este fin de semana']"));

    public Button prioridadButton = new Button(By.xpath("//div[text()=\"Prioridad\"]/following-sibling::div//div/button[@aria-haspopup=\"listbox\"]"));

    public Button prioridad2 = new Button(By.xpath("//span[@class='priority_picker_item_name' and text()='Prioridad 2']"));

    public TextBox nameTextBox = new TextBox(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
}
