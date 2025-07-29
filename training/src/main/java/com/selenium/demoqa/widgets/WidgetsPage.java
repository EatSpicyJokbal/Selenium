package com.selenium.demoqa.widgets;

import org.openqa.selenium.By;

import com.selenium.demoqa.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private final By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private final By selectDatePicker = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private final By progressBar = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    private final By selectSlider = By.xpath("//li[@id='item-3']/span[text()='Slider']");

    public SelectMenuPage clickMenuPage() {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public SelectDatePickerPage clickDatePicker() {
        scrollToElementJS(selectDatePicker);
        click(selectDatePicker);
        return new SelectDatePickerPage();
    }

    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBar);
        click(progressBar);
        return new ProgressBarPage();
    }

    public SliderPage clickSlider() {
        scrollToElementJS(selectSlider);
        click(selectSlider);
        return new SliderPage();
    }

}
