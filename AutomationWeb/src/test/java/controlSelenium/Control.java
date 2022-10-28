package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import singletonSession.Session;

import java.time.Duration;

public class Control {

    protected By locator;
    protected WebElement control;

    public Control (By locator){
        this.locator=locator;
    }

    protected void findControl(){
        control= Session.getInstance().getBrowser().findElement(this.locator);
    }
    public Integer findControls(){
        return Session.getInstance().getBrowser().findElements(this.locator).size()-1;
    }

    /**
     *
     */
    public void click(){
        this.findControl();
        control.click();
    }
    public void checkSlectable(By element, WebDriver driver) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }
    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getText(){
        this.findControl();
        return control.getText();
    }

    public void waitVisibility(){
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }

    public void waitPresence(){
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(this.locator));
    }
    public void waitClickable()
    {
        // todo --> factory para instanciar el wait una sola vez
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(this.locator));
    }
    public void waitControl(By locator, int timeOut) throws InterruptedException {
        Label test = new Label(this.locator); //subject
        int i = 0;
        do {
            Thread.sleep(1000);
            i++;
            this.control.click(); //refresh
        } while (!test.isControlDisplayed() || i <= timeOut);
    }

    public void waitTextToBePresent(String value)
    {
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(this.locator, value));
    }


}

