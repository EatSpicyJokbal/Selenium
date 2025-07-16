package com.selenium.demoqa.widgets;

import java.util.List;

import org.openqa.selenium.By;

import static utilities.DropdownUtility.deselectByIndex;
import static utilities.DropdownUtility.deselectByValue;
import static utilities.DropdownUtility.getAllSelectedOptions;
import static utilities.DropdownUtility.selectByIndex;
import static utilities.DropdownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {
    private final By standardMultiSelect = By.xpath("//*[@id=\"cars\"]");

    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, text);
    }

    public void deselectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        deselectByIndex(standardMultiSelect, index);
    }

    public List<String> getAllSelectedStandardMulti() {
        return getAllSelectedOptions(standardMultiSelect);
    }
}
