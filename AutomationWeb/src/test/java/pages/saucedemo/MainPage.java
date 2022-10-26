package pages.saucedemo;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Button cartButton = new Button(By.xpath("//div[@id='shopping_cart_container']"));
    public Label titleLabel = new Label(By.xpath("//span[@class='title']"));
    public Button sortButton = new Button(By.xpath("//select[@class='product_sort_container']"));
    public Button lowHighOption = new Button(By.xpath("//option[@value='lohi']"));
    public Button addFirstProductButton = new Button(By.xpath("//div[1]//button[@id='add-to-cart-sauce-labs-onesie']"));
    public Button firstProductName = new Button(By.xpath("//div[1]//div[@class='inventory_item_name']"));
}
