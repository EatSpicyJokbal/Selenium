package Part2.Test.testPackage;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.selenium.saucedemo.ProductsPage;

import Part2.Base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed() {
        ProductsPage productsPage = 
                loginPage.loginIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductHeaderDisplayed(), "\n Products Page is not Displayed");
    }
}
