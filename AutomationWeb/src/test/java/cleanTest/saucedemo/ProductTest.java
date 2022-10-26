package cleanTest.saucedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest extends TestBaseSaucedemo {

    @Test
    public void verifyProductTest() throws InterruptedException {

        String username = "performance_glitch_user";
        String password = "secret_sauce";

        //LOGIN

        loginPage.usernameTextBox.setText(username);
        loginPage.passwordTextBox.setText(password);
        loginPage.loginButton.waitClickable();
        loginPage.loginButton.click();

        //verificacion login

        //Assertions
        Assertions.assertTrue(mainPage.titleLabel.isControlDisplayed(),
                "ERROR login was not successfully");

        //SORT LOW HIGH

        mainPage.sortButton.click();
        mainPage.lowHighOption.click();

        //SELECT PRODUCT AND VERIFY
        mainPage.addFirstProductButton.waitClickable();
        mainPage.addFirstProductButton.click();
        mainPage.cartButton.waitClickable();
        mainPage.cartButton.click();

        //VERIFICATION PRODUCT SELECTED

        Assertions.assertTrue(cartSection.productWithNameExist(mainPage.firstProductName.getText()),"ERROR no se selecciono el producto");


    }
}
