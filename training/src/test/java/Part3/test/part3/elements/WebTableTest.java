package Part3.test.part3.elements;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "cierra@example.com";
        String age = "56";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge(age);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getAge(email);
        String expectedAge = age;
        assertEquals(actualAge, expectedAge, "\n Actual Age and Expected Age Do not Match \n");
    }
}
