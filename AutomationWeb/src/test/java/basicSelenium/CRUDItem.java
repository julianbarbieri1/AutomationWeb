package basicSelenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CRUDItem {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://todo.ly/");
        //implicit wait --> generico
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    @Test
    @Disabled
    public void crudTest() throws InterruptedException {
        //LOGIN
        String email="pepe@pepe.com";
        String password ="pepe";

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(email);
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys(password);
        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        //Thread.sleep(2000);
        // Explicit Wait --- Button -> Logout

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));

        Wait<WebDriver> fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));

        Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),
                "ERROR!! no se pudo iniciar sesion");

        /*
         * CREATE PROJECT
         * */

        String nameProj = "AUTO PROJECT " + new Date().getTime();

        driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        driver.findElement(By.id("NewProjNameInput")).sendKeys(nameProj);
        driver.findElement(By.id("NewProjNameButton")).click();

        //Thread.sleep(2000);

        //verifico proyecto creado

        wait.until(ExpectedConditions.textToBe(By.xpath("//li[last()]//td[text()='" + nameProj + "']"), nameProj));
        String actualResult1 = driver.findElement(By.xpath("//li[last()]//td[text()='" + nameProj + "']")).getText();
        String expectedResult1 = nameProj;
        Assertions.assertEquals(expectedResult1, actualResult1, "ERROR no se creo el project");

        String itemName = "Item";

        //CREATE ITEM Terminado

        //click button project created xpath = //li[last()]//td[text()='AUTO PROJECT']
        driver.findElement(By.xpath("//li[last()]//td[text()='"+ nameProj + "']")).click();

        //click on input textbox id = NewItemContentInput
        driver.findElement(By.id("NewItemContentInput")).click();

        //set nombre del item id = NewItemContentInput
        driver.findElement(By.id("NewItemContentInput")).sendKeys(itemName);

        //click add button id = NewItemAddButton
        driver.findElement(By.id("NewItemAddButton")).click();

        //verificacion el item creado
/*
        wait.until(ExpectedConditions.textToBe(By.xpath("//li[last()]//div[text()='" + itemName + "']"), itemName));
        String actualResult2 = driver.findElement(By.xpath("//li[last()]//td[text()='" + itemName + "']")).getText();
        String expectedResult2 = itemName;
        Assertions.assertEquals(expectedResult2, actualResult2, "ERROR no se pudo crear el item");
*/
        //UPDATE ITEM

        String newItemName = "New Item";

        //click on item created //li[last()]//div[text()='Item']
        driver.findElement(By.xpath("//li[last()]//div[text()='" + itemName + "']")).click();

        //clear
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).clear();

        // textarea[@id='ItemEditTextbox']
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys(newItemName + Keys.ENTER);


        //verifico
        /*wait.until(ExpectedConditions.textToBe(By.xpath("//li[last()]//div[text()='" + newItemName + "']"), newItemName));
        String actualResult = driver.findElement(By.xpath("//li[last()]//td[text()='" + newItemName + "']")).getText();
        String expectedResult = newItemName;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR no se pudo actualizar el item");
*/

        //DELETE

        //click on item created //li[last()]//div[text()='Item']
        driver.findElement(By.xpath("//li[last()]//div[text()='" + newItemName + "']")).click();

        //click menu button del item //li[last()]//img[@style='display: inline;']
        driver.findElement(By.xpath("//li[last()]//img[@class='ItemMenu']")).click();

        //click delete button li[last()]//a[text()='Delete']
        driver.findElement(By.xpath("//li[last()]//a[@href='#delete']")).click();
        Thread.sleep(2000);
        //verifico

       /* wait.until(ExpectedConditions.textToBe(By.xpath("//li[last()]//div[text()='" + newItemName + "']"), newItemName));
        String actualResult3 = driver.findElement(By.xpath("//li[last()]//td[text()='" + newItemName + "']")).getText();
        String expectedResult3 = newItemName;
        Assertions.assertNotEquals(expectedResult3, actualResult3, "ERROR no se pudo actualizar el item");
*/
    }
}
