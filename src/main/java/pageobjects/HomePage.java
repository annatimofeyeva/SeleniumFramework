package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseMain {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    String urlMyFork = "https://test.my-fork.com/";
    String btnSighUp = "//div[@id='sign-up-button']//..";

    public void clickSighUp() throws InterruptedException {
        driver.get(urlMyFork);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath(btnSighUp)).click();
    }
}
