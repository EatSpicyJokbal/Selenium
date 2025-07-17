package Part3.test.part4.modal;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class ModalDialogsTest extends BaseTest {

    @Test
    public void testModalDialogs() {
        var modalDialogs = homePage.goToAlertFrameAndWindows().clickModalDialogs();
        modalDialogs.clickSmallModalButton();
        String actualResult = modalDialogs.getSmallModalText();
        assertTrue(actualResult.contains("This is a small modal."));
        modalDialogs.clickSmallModalCloseButton();
    }

}
