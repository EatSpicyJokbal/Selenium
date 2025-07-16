package utilities;

import org.openqa.selenium.WebDriver;

import com.selenium.base.BasePage;

public class Utility {
    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    public static void delay(long milli) {
        try{
            Thread.sleep(milli);
        }catch (InterruptedException e) {
            System.err.println("Sleep was Interrupted");
        }
    }
    
}
