package com.selenium.saucedemo;

import org.openqa.selenium.By;

import com.selenium.base.BasePage;

public class ProductsPage extends BasePage {
    private final By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}
