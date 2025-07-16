package Part3.test.part3.forms;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToFormsPage().clickPracticeForm();
        formsPage.clickSportCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.unclickReadingCheckbox();
        
        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        assertFalse(isReadingCheckboxSelected,"\n Reading Checkbox is Selected. \n");
    }
}
