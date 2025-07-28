package Part3.test.part4.dynamic_wait;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testAfterButtonText() {
        var dynamicProperties = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicProperties.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        assertEquals(actualText, expectedText, "The button text is not as expected after waiting.");
    }
} 


