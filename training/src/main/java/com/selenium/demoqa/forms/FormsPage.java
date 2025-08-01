package com.selenium.demoqa.forms;

import org.openqa.selenium.By;

import com.selenium.demoqa.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private final By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
    
    public PracticeFormPage clickPracticeForm() {
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
        
    }
}
