package utilities;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility extends Utility {

    private static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text) {
        findDropDown(locator).selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);
    }

    public static void selectByValue(By locator, String text) {
        findDropDown(locator).selectByValue(text);
    }

    public static void deselectByVisibleText(By locator, String text) {
        findDropDown(locator).deselectByVisibleText(text);
    }

    public static void deselectByIndex(By locator, int index) {
        findDropDown(locator).deselectByIndex(index);
    }

    public static void deselectByValue(By locator, String text) {
        findDropDown(locator).deselectByValue(text);
    }

    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions = findDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
