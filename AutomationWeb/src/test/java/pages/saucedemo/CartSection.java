package pages.saucedemo;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class CartSection {

    public boolean productWithNameExist(String name){
        Label productSelected = new Label(By.xpath("//div[text()='"+name+"']"));
        return (productSelected.isControlDisplayed());

    }

}
