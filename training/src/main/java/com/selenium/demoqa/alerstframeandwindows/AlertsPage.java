package com.selenium.demoqa.alerstframeandwindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends AlertFrameAndWindowsPage {

    private final By alertButton = By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='alertButton']");
    private final By confirmButton = By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='confirmButton']");
    private final By promtButton = By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='promtButton']");
    private final By promptResult = By.xpath("//div[@id='javascriptAlertsWrapper']//span[@id='promptResult']");
    private final By confirmationResult = By.xpath("//div[@id='javascriptAlertsWrapper']//span[@id='confirmResult']");


    public void clickAlertButton() {
        click(alertButton);
    }

    public void clickConfirmButton() {
        scrollToElementJS(confirmButton);
        click(confirmButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public void clickPromtButton() {
        scrollToElementJS(promtButton);
        click(promtButton);
    }

    public String getPromptResult() {
        return find(promptResult).getText();
    }
}
