package Part3.test.part4.alerts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import Part3.base.BaseTest;
import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.dismissAlert;
import static utilities.SwitchToUtility.getAlertText;
import static utilities.SwitchToUtility.sendKeysAlert;


@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertPage = homePage.goToAlertFrameAndWindows().clickAlertsPage();
        alertPage.clickAlertButton();
        assertEquals(getAlertText(), expectedAlertText, "Actual and Expected Message Do not Match");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        String expectedResultText = "You clicked: Ok";
        var alertPage = homePage.goToAlertFrameAndWindows().clickAlertsPage();
        alertPage.clickConfirmButton();
        dismissAlert();
        String actualResultText = alertPage.getConfirmationResult();
        assertNotEquals(actualResultText, expectedResultText, "Actual and Expected Result Match");
    }

    public void testPromtAlert() {
        String sendText = "Joshua Tagle";
        var alertPage = homePage.goToAlertFrameAndWindows().clickAlertsPage();
        alertPage.clickPromtButton();
        sendKeysAlert(sendText);
        acceptAlert();
        String actualResultText = alertPage.getPromptResult();
        assertTrue(actualResultText.contains(sendText),"Text input Do not contain " + sendText);
    }
}
