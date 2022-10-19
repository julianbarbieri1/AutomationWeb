package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.Date;

public class NewAccount {


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
    public void newAccount() throws InterruptedException {

        String fullName="julian barbieri";
        String email= "mail"+new Date().getTime()+"@mail.com";
        String password ="julian";
        String newPassword = "juli";

        //CREATE NEW ACCOUNT

        // click sign up free button
        driver.findElement(By.xpath("//img[contains(@src,'/Images/design/pagesignup.png')]")).click();

        // set full name
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys(fullName);

        // set email
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys(email);

        //set password
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys(password);

        //check checkbox agreement ctl00_MainContent_SignupControl1_CheckBoxTerms
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();

        //click sign up button
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();

        //VERIFICACIONES NEW ACCOUNT

        //explicit wait button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));

        Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR!! no se pudo crear la cuenta");

        //CAMBIAR CONTRASEÑA

        //click settings button
        driver.findElement(By.xpath("//a[text()=\'Settings\']")).click();
        Thread.sleep(1000);

        // Set old password id TextPwOld
        driver.findElement(By.id("TextPwOld")).sendKeys(password);
        Thread.sleep(1000);

        // Set new password id TextPwNew
        driver.findElement(By.id("TextPwNew")).sendKeys(newPassword);
        Thread.sleep(1000);

        //click ok button //span[text()='Ok']
        driver.findElement(By.xpath(" //span[text()='Ok']")).click();
        Thread.sleep(1000);

        //click logout button id ctl00_HeaderTopControl1_LinkButtonLogout
        driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).click();
        Thread.sleep(1000);

        //VERIFICAR QUE ENTRA CON LA NUEVA CONTRASEÑA

        // click login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        Thread.sleep(2000);

        // set email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(email);
        Thread.sleep(2000);

        // set pwd
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys(newPassword);
        Thread.sleep(2000);

        // click login
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(2000);

        // verificacion
        Assertions.assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]")).isDisplayed(),"ERROR!! no se pudo iniciar sesion");


    }
}
