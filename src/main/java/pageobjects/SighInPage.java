package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SighInPage extends BaseMain
{
    public SighInPage(WebDriver driver) {
        super(driver);
    }
    String inputEmail = "//input[@type = 'email']";
    String inputPassword = "//input[@type = 'password']";
    String btnLogIn = "//button[@type = 'submit']";
    String inputCheckBox = "//input[@id='cia-remember-me']";

    public void fillSighInFormBySubmit() throws InterruptedException {
        driver.findElement(By.xpath(inputEmail)).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath(inputPassword)).sendKeys("password");
        driver.findElement(By.xpath(btnLogIn)).submit();
        Thread.sleep(2000);
    }
    public void fillSighInFormByClick() throws InterruptedException {
        driver.findElement(By.xpath(inputEmail)).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath(inputPassword)).sendKeys("password");
        driver.findElement(By.xpath(btnLogIn)).click();
        Thread.sleep(2000);
    }
    public void fillSighInFormByPressEnter() throws InterruptedException {
        driver.findElement(By.xpath(inputEmail)).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath(inputPassword)).sendKeys("password");
        driver.findElement(By.xpath(btnLogIn)).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void validateDefaultStateOfCheckbox() {
        boolean checkboxCheckedByDefault = driver.findElement(By.xpath(inputCheckBox)).isSelected();
        System.out.println("CheckboxCheckedByDefault: " + checkboxCheckedByDefault);
    }
}

