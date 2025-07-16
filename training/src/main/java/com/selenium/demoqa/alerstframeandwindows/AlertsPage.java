package com.selenium.demoqa.alerstframeandwindows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertFrameAndWindowsPage {

    private final By alertButton = By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='alertButton']");


    public void clickAlertButton() {
        click(alertButton);
    }
}
