package Part3.test.part4.frames;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;


public class testFrames extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framePage = homePage.goToAlertFrameAndWindows().clickFramesPage();
        String actualBigBoxText = framePage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        assertEquals(actualBigBoxText, expectedBigBoxText, "Actual and Expected Text Do no Match");
        String actualHeaderText = framePage.getHeaderText();
        String expectedHeaderText = "Frames";
        assertEquals(actualHeaderText, expectedHeaderText, "Actual and Expected Text Do no Match");
    }

    @Test
    public void testFramesSmallBox() {
        var framePage = homePage.goToAlertFrameAndWindows().clickFramesPage();
        String actualSmallBoxTest = framePage.getTextInSmallFrame();
        String expectedSmallBoxTest = "This is a sample page";
        assertEquals(actualSmallBoxTest, expectedSmallBoxTest, "Actual and Expected Text do not match");
        String actualHeaderText = framePage.getHeaderText();
        String expectedHeaderText = "Frames";
        assertEquals(actualHeaderText, expectedHeaderText, "Actual and Expected Text Do no Match");
    }
}
