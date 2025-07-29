package Part3.test.part4.dynamic_wait;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testAfterButtonText() {
        var dynamicProperties = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicProperties.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        assertEquals(actualText, expectedText, "The button text is not as expected after waiting.");
    }

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartStopButton();
        String actualValue = progressBarPage.getProgressBarValue();
        String expectedValue = "100%";
        assertEquals(actualValue, expectedValue, "The progress bar value is not as expected after starting.");
    }
} 


