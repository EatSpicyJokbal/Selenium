package com.selenium.demoqa.elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private final By registrationAgeField = By.xpath("//div[@id='age-wrapper']//input[@id='age']");
    private final By submitButton = By.xpath("//*[@id='submit']");

    public void clickEdit(String email) {
        By edit = By.xpath("//div[text()='" + email + "']//following::span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age) {
        set(registrationAgeField, age);
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    public String getAge(String email) {
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return find(tableAge).getText();
    }
}
