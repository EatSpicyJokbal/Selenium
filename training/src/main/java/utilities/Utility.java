package utilities;

import org.openqa.selenium.WebDriver;

import com.selenium.base.BasePage;

public class Utility {
    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }
    
}
