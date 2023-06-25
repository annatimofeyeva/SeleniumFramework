package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    public ChromeDriver driver;
    @BeforeTest
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
