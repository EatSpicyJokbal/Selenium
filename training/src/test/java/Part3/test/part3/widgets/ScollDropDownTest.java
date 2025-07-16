package Part3.test.part3.widgets;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class ScollDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickMenuPage();
        selectMenuPage.selectStandardMulti("Saab");
        selectMenuPage.selectStandardMulti(0);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("volvo");
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMulti();
        assertFalse(actualSelectedOptions.contains("Volvo"));
        assertTrue(actualSelectedOptions.contains("Saab"));
        assertTrue(actualSelectedOptions.contains("Opel"));
        assertTrue(actualSelectedOptions.contains("Audi"));
    }

}
