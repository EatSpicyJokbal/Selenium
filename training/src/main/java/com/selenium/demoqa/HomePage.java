package com.selenium.demoqa;

import org.openqa.selenium.By;

import com.selenium.base.BasePage;
import com.selenium.demoqa.forms.FormsPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToFormsPage() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}


