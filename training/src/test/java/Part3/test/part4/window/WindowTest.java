package Part3.test.part4.window;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;
import static utilities.GetUtility.getURL;

public class WindowTest extends BaseTest{

    @Test
    public void testNewWindow() {
        var browserWindowPage = homePage.goToAlertFrameAndWindows().clickBrowserWindows();
        browserWindowPage.clickNewWindowButton();
        browserWindowPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        assertEquals(actualURL, expectedURL, "Actual and Expected URL do not match");
    }

}
