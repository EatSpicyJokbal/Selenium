package com.selenium.demoqa.alerstframeandwindows;



import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertFrameAndWindowsPage {
    private final By smallModalButton = By.xpath("//div[@id='modalWrapper']//button[@id='showSmallModal']");
    private final By largeModalButton = By.xpath("//div[@id='modalWrapper']//button[@id='showLargeModal']");

    private final By smallModalText = By.xpath("//div[@class='modal-content']//div[@class='modal-body']");
    private final By smallModalCloseButton = By.xpath("//div[@class='modal-content']//button[@id='closeSmallModal']");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public void clickLargeModalButton() {
        click(largeModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickSmallModalCloseButton() {
        click(smallModalCloseButton);
    }
}
