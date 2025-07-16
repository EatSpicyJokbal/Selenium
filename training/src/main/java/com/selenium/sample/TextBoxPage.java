package com.selenium.sample;

import org.openqa.selenium.By;

import com.selenium.demoqa.elements.ElementsPage;

import static utilities.JavaScriptUtility.clickJS;

public class TextBoxPage extends ElementsPage {
    private final By fullName = By.xpath("//*[@id='userName']");
    private final By emailAddress = By.xpath("//*[@id='userEmail']");
    private final By currentAddress = By.xpath("//*[@id='currentAddress']");
    private final By permanentAddress = By.xpath("//*[@id=\"permanentAddress\"]");
    private final By submitButton = By.xpath("//*[@id='submit']");

    private final By resultName = By.xpath("//*[@id=\"name\"]");

    public void setFullName(String fName) {
        set(fullName, fName);
    }
    
    public void setEmailAddress(String email) {
        set(emailAddress, email);
    }

    public void setCurrentAddress(String cAddress) {
        set(currentAddress, cAddress);
    }

    public void setPermanentAddress( String pAddress) {
        set(permanentAddress, pAddress);
    }

    public void clickSubmitButton() {
        clickJS(submitButton);
    }

    public String resultIsDisplayed() {
        return find(resultName).getText();
    }
}
