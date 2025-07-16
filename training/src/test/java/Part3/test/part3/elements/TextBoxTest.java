package Part3.test.part3.elements;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test
    public void testTextBox() {
        String fName = "Joshua Tagle";
        var textPage = homePage.goToElements().clickTextBox();
        textPage.setFullName(fName);
        textPage.setEmailAddress("sample@example.com");
        textPage.setCurrentAddress("OCC");
        textPage.setPermanentAddress("Pasay City");
        textPage.clickSubmitButton();
        String actualResult = "Name:"+fName;
        String expectedResult = textPage.resultIsDisplayed();
        assertEquals(actualResult, expectedResult ,"\n The Actual Result and Expected Result do not match");
    }
}
