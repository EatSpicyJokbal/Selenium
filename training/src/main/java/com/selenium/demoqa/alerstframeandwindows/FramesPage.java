package com.selenium.demoqa.alerstframeandwindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.switchFrame;
import static utilities.SwitchToUtility.switchToDefaultFrame;
import static utilities.Utility.delay;

public class FramesPage extends AlertFrameAndWindowsPage {
    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerTextFrame = By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderText() {
        return find(headerTextFrame).getText();
    }

    public String getTextInBigFrame() {
        delay(2000);
        switchFrame(iFrameBigBox);
        scrollToElementJS(textInFrame);
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text : " + bigFrameText);
        switchToDefaultFrame();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        delay(2000);
        switchFrame(3);
        scrollToElementJS(textInFrame);
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultFrame();
        return smallFrameText;
    }
}
