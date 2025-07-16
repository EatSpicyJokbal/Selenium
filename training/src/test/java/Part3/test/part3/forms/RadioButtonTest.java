package Part3.test.part3.forms;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToFormsPage().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        assertTrue(formsPage.isFemaleRadioButtonSelected(), "\n Female Radio button is not selected");
    }
}