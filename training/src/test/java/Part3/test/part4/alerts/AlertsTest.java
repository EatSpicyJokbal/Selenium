package Part3.test.part4.alerts;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;
import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertPage = homePage.gotToAlertFrameAndWindows().clickAlertsPage();
        alertPage.clickAlertButton();
        assertEquals(getAlertText(), expectedAlertText, "Actual and Expected Message Do not Match");
        acceptAlert();
    }
}
