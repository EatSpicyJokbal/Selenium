package com.selenium.demoqa.widgets;

import org.openqa.selenium.By;

import static utilities.DropdownUtility.selectByVisibleText;

public class SelectDatePickerPage extends WidgetsPage {
    private final By selectDateField = By.xpath("//*[@id=\"datePickerMonthYearInput\"]");
    private final By monthDropDown = By.className("react-datepicker__month-select");
    private final By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day, String month) {
        String dayWithoutLeadingZero = day.replaceFirst("^0+", "");
        if (dayWithoutLeadingZero.isEmpty()) dayWithoutLeadingZero = "0";
        
        return By.xpath("//div[contains(@class,'react-datepicker__day') and text()='" + dayWithoutLeadingZero + "' and contains(@aria-label,'" + month + "')]");
    }

    public void clickSelectDate() {
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getDomAttribute("value");
    }

    public void getMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }

    public void getYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }

    public void clickDay(String day, String month) {
        click(dayValue(day, month));
    }

    public boolean isDayInMonth(String day, String month) {
        return find(dayValue(day,month)).isDisplayed();
    }
}
