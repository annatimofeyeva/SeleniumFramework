package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseMain
{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    String urlBestBuy = "https://www.bestbuy.com";
    String btnAccount = "//span[text() = 'Account']";
    String btnSighIn = "//a[text() = 'Sign In']";

    public void clickSighIn() throws InterruptedException {
        driver.get(urlBestBuy);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(btnSighIn)).click();
    }
}
