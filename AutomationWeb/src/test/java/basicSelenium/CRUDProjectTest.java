package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRUDProjectTest {

    WebDriver driver;
    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://todo.ly/");

    }
    @AfterEach
    public void cleanUp(){
        driver.quit();
    }

    @Test
    public void create() throws InterruptedException {

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("pepe@pepe.com");
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("pepe");
        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        Thread.sleep(2000);


        //CREATE

        // click en add button
        driver.findElement(By.xpath("//*[@id=\'MainTable\']/tbody/tr/td[1]/div[6]/div")).click();
        Thread.sleep(2000);

        // set project
        driver.findElement(By.id("NewProjNameInput")).sendKeys("new project");
        Thread.sleep(2000);

        // add project
        driver.findElement(By.id("NewProjNameButton")).click();
        Thread.sleep(2000);

        // verificacion //*[@id="ItemId_4026714"]

        Assertions.assertTrue(driver.findElement(By.xpath("//li[last()]//td[text()='new project']")).isDisplayed(),"ERROR!! no se pudo agregar el proyecto");

    }

    @Test
    public void update() throws InterruptedException {

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("pepe@pepe.com");
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("pepe");
        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        Thread.sleep(2000);


        //UPDATE no terminado

        //click project to update

        // click icon next to the project
        driver.findElement(By.id("ListCount")).click();
        Thread.sleep(2000);

        // click edit button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("selenium@selenium2022.com");
        Thread.sleep(2000);

        // clear the name project
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("selenium@selenium2022.com");
        Thread.sleep(2000);

        // set new name project
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        Thread.sleep(2000);

        // click save button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(2000);

        // verificacion
        Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR!! no se pudo iniciar sesion");

    }

    @Test
    public void delete() throws InterruptedException {

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("pepe@pepe.com");
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("pepe");
        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        Thread.sleep(2000);

        //DELETE no terminado

        //click project to update

        // click icon next to the project
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        Thread.sleep(2000);

        // click delete button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("selenium@selenium2022.com");
        Thread.sleep(2000);

        // click aceptar button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        Thread.sleep(2000);

        // verificacion
        Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR!! no se pudo iniciar sesion");

    }

    @Test
    public void loginTodoLyTest() throws InterruptedException {

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("pepe@pepe.com");
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("pepe");
        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        Thread.sleep(2000);
        // verificacion

        Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR!! no se pudo iniciar sesion");

    }

}
