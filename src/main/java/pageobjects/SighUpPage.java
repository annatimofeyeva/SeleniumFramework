package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SighUpPage extends BaseMain {
    public SighUpPage(WebDriver driver) {
        super(driver);
    }
    String jobTitleField = "//select[@id='job-title']";

    public void verifyJobTitlesInSighUpForm() {
        WebElement titlesDropDown = driver.findElement(By.xpath(jobTitleField));
        Select searchOptions = new Select(titlesDropDown);
        List<WebElement> options = searchOptions.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
    }
}
