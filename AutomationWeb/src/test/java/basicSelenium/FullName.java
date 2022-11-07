package basicSelenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class FullName {

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
    public void changeFullName() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        String email="pepe@pepe.com";
        String password ="pepe";
        String newFullName ="NEW FULL NAME" + new Date().getTime();

        //LOGIN

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(email);
        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys(password);
        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(2000);
        //CAMBIAR FULL NAME

        //click settings button
        driver.findElement(By.xpath("//a[text()=\'Settings\']")).click();

        //clear
        driver.findElement(By.id("FullNameInput")).clear();

        // Set new full name
        driver.findElement(By.id("FullNameInput")).sendKeys(newFullName);
        Thread.sleep(2000);

        //click ok button //span[text()='Ok']
        driver.findElement(By.xpath(" //span[text()='Ok']")).click();

        //VERIFICO EN SETTINGS

        //click settings button
        driver.findElement(By.xpath("//a[text()=\'Settings\']")).click();

        wait.until(ExpectedConditions.textToBe(By.xpath("//li[last()]//td[text()='" + newFullName + "']"), newFullName));

        String actualResult = driver.findElement(By.id("FullNameInput")).getAttribute("value");
        String expectedResult = newFullName;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR no se cambio el full name");




    }

}
