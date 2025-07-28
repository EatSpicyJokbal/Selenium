package com.selenium.demoqa.elements;

import org.openqa.selenium.By;

import com.selenium.demoqa.HomePage;
import com.selenium.sample.TextBoxPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private final By webTables = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private final By linkMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private final By textBox = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private final By dynamicProperties = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");

    public WebTablesPage clickWebTables() {
        click(webTables);
        return new WebTablesPage();
    }

    public LinksPage clickLinksPage() {
        click(linkMenuItem);
        return new LinksPage();
    }

    public TextBoxPage clickTextBox() {
        click(textBox);
        return new TextBoxPage();
    }

    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicProperties);
        click(dynamicProperties);
        return new DynamicPropertiesPage();
    }

}
