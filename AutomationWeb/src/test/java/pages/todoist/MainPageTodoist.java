package pages.todoist;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class MainPageTodoist {
    public Button addProjectButton= new Button(By.xpath("//button[@class='a8af2163 _98cd5c3f _45ffe137 ef4c88db f9408a0e']"));

    public Button masProyectosButton = new Button(By.xpath("//li[last()]//button[@class='q-PolHQBMEHmpVzKzPeWWA==']"));

    public Button editarButton = new Button(By.xpath("//div[text()='Editar proyecto']"));

    public Button eliminarButton = new Button(By.xpath("//div[text()='Eliminar proyecto']"));
}
