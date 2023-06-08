package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTestCases {
    @Test
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        // I connected Java 11 to the Project, so I have to add ChromeOptions below
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.nytimes.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
