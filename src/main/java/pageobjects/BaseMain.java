package pageobjects;
import org.openqa.selenium.WebDriver;

// Constructor
public class BaseMain
{
    public WebDriver driver;
    public BaseMain (WebDriver driver) {
        this.driver = driver;
    }
}
