package com.selenium.demoqa;

import org.openqa.selenium.By;

import com.selenium.base.BasePage;
import com.selenium.demoqa.alerstframeandwindows.AlertFrameAndWindowsPage;
import com.selenium.demoqa.elements.ElementsPage;
import com.selenium.demoqa.forms.FormsPage;
import com.selenium.demoqa.widgets.WidgetsPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private final By widgetsCard = By.xpath("//div[@class='card-body']//h5[text()='Widgets']");
    private final By alertsFrameAndWindowsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");

    public FormsPage goToFormsPage() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public AlertFrameAndWindowsPage gotToAlertFrameAndWindows() {
        scrollToElementJS(alertsFrameAndWindowsCard);
        click(alertsFrameAndWindowsCard);
        return new AlertFrameAndWindowsPage();
    }
}


