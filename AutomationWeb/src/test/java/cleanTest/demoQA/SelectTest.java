package cleanTest.demoQA;

import org.junit.jupiter.api.Test;

public class SelectTest extends TestBaseSelectDemoQA {

    @Test
    public void verifyItemSelectedTest() throws InterruptedException {


        //click item

        selectableSection.item1.isControlDisplayed();
        //Thread.sleep(2000);
        selectableSection.item1.click();

        Thread.sleep(1000);
    }
}