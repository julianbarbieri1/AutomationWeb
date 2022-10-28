package pages.ticktick;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class HabitSection {

    public Button addHabit = new Button(By.xpath("//span[@class='inline-block w-[18px] h-[18px] mr-[8px] cursor-pointer']//div[@class='relative bgIconWrapper_aJONI']"));

    public TextBox addHabitTextBox = new TextBox(By.xpath("//input[@placeholder='Daily Check-in']"));

    public Button saveButton = new Button(By.xpath("//button[text()='Save']"));

    public boolean habitExist(String name){
        Label habitName= new Label(By.xpath("//div[@class='habit_3UL4d flex items-center relative py-[8px] px-[20px] cursor-pointer h-full']//p[text()='"+name+"']"));
        return (habitName.isControlDisplayed());

    }
}
