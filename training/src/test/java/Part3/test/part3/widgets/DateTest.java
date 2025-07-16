package Part3.test.part3.widgets;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import Part3.base.BaseTest;

public class DateTest extends BaseTest {
    
    @Test
    public void testSelectingDate() {
        String day = "15";
        String month = "September";
        String monthNumber = "09";
        String year = "1999";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.getMonth(month);
        datePickerPage.getYear(year);
        datePickerPage.clickDay(day, month);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        assertEquals(actualDate, expectedDate, "Actual date and Expected date do not match");
    }
}
