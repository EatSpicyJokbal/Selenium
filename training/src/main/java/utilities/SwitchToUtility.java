package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void sendKeysAlert(String text) {
        switchTo().alert().sendKeys(text);
    }
    public static void switchFrame(String nameOrId) {
        switchTo().frame(nameOrId);
    }

    public static void switchFrame(int index) {
        switchTo().frame(index);
    }
 
    public static void switchFrame(WebElement element) {
        switchTo().frame(element);
    }

    public static void switchToParentFrame() {
        switchTo().parentFrame();
    }

    public static void switchToDefaultFrame() {
        switchTo().defaultContent();
    }
}
