package com.selenium.demoqa.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage {

    private final By visibleAfterButton = By.xpath("//button[@id='visibleAfter']");

    public String getVisibleAfterButtonText() {
        explicitWaitUntilVisible(visibleAfterButton, 5);
        String visibleText = getText(visibleAfterButton);
        return visibleText;
    }
} 


