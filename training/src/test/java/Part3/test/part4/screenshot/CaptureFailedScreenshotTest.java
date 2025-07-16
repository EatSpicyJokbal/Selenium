package Part3.test.part4.screenshot;

import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToFormsPage().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }

}
