package com.selenium.demoqa.alerstframeandwindows;

import java.util.Set;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends AlertFrameAndWindowsPage {
    private final By newWindowButton = By.xpath("//div[@id='windowButtonWrapper']//button[@id='windowButton']");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        String originalWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!originalWindowHandle.equals(handle)) {
                switchToWindow(handle);
            }
        }
    }


}
