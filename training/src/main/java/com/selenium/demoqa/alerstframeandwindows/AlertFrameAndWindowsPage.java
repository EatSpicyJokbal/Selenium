package com.selenium.demoqa.alerstframeandwindows;

import org.openqa.selenium.By;

import com.selenium.demoqa.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertFrameAndWindowsPage extends HomePage {
    private final By modalDialogs = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private final By alertsCard = By.xpath("//li[@id='item-1']/span[text()='Alerts']");

    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogs);
        click(modalDialogs);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlertsPage() {
        scrollToElementJS(alertsCard);
        click(alertsCard);
        return new AlertsPage();
    }

}
