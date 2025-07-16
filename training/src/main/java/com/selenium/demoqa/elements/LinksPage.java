package com.selenium.demoqa.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.Utility.delay;

public class LinksPage extends ElementsPage {
    private final By badRequestLink = By.xpath("//div[@id='linkWrapper']//a[text()='Bad Request']");
    private final By responseLink = By.xpath("//div[@id='linkWrapper']//p[@id='linkResponse']");

    public void clickBadResponse() {
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }
}
