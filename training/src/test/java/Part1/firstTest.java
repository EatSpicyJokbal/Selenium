package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void quitWindow() {
        driver.quit();
    }

    @Test
    public void testLogginApplication() throws InterruptedException {
        Thread.sleep(3000);
        WebElement testUsername = driver.findElement(By.name("username"));
        testUsername.sendKeys("Admin");

        var testPassword = driver.findElement(By.name("password"));
        testPassword.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
