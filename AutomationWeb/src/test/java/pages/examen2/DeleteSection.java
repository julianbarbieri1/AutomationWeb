package pages.examen2;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class DeleteSection {
    public Button masAccionesButton = new Button(By.xpath("//div[@class=\"f9408a0e f53218d5\"]/button[contains(@aria-label,\"s acciones\")]"));
    public Button eliminarButton = new Button(By.xpath("//div[contains(text(),\"Eliminar tar\")]"));
    public Button confirmationButton = new Button(By.xpath("//button[@class='a8af2163 _3d1243b2 _352995bd f9408a0e _56a651f6']"));
}
