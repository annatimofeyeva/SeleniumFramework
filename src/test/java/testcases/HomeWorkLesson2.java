package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
        - Open website   - https://test.my-fork.com/
        - Open Sign In page using corresponding button on main page
        - Validate that Email field, Password field and Login button are displayed on Sign In page
        - Enter invalid email and password in corresponding fields and click Log In button
        - Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        - Validate that Remember Me checkbox is checked by default
 */
public class HomeWorkLesson2 {
    @Test
    public void openMyFork() {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void openSighInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        driver.close();
    }
    @Test
    public void validateEmailFieldIsDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        boolean expectedEmailFieldPresence = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
        Assert.assertEquals(expectedEmailFieldPresence, true);
        driver.close();
    }
    @Test
    public void validatePasswordFieldIsDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        boolean expectedPasswordFieldPresence = driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
        Assert.assertEquals(expectedPasswordFieldPresence, true);
        driver.close();
    }
    @Test
    public void validateLoginButtonIsDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        System.out.println(driver.findElement(By.xpath("//button[text()='Log In']")).isDisplayed());
        boolean actualLoginButtonPresence = driver.findElement(By.xpath("//button[text()='Log In']")).isDisplayed();
        Assert.assertEquals(actualLoginButtonPresence, true);
        driver.close();
    }
    @Test
    public void testInvalidEmailAndPasswordCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Log In']")).submit();
        driver.close();
    }
    // USED CLICK() TO SUBMIT FORM
    @Test
    public void validateBlankEmailAndPasswordFieldsWithClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        // blank email and password fields submitted
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        Thread.sleep(4000);
        String actualErrorMessageText;
        actualErrorMessageText = driver.findElement(By.xpath("//p[text()='Error: fields are empty']")).getText();
        Assert.assertEquals(actualErrorMessageText, "Error: fields are empty");
        driver.close();
    }
    // USED SUBMIT() TO SUBMIT FORM
    @Test
    public void validateBlankEmailAndPasswordFieldsWithSubmit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
        driver.findElement(By.xpath("//button[text()='Log In']")).submit();
        Thread.sleep(2000);
        String actualEmailErrorMessageText = driver.findElement(By.xpath("//span[text()='The email field is required.']")).getText();
        Assert.assertEquals(actualEmailErrorMessageText, "The email field is required.");
        String actualPasswordErrorMessageText = driver.findElement(By.xpath("//span[text()='The password field is required.']")).getText();
        Assert.assertEquals(actualPasswordErrorMessageText, "The password field is required.");
        driver.close();
    }
    // USED CLICK() TO SUBMIT FORM
    @Test
    public void validateIncorrectEmailFormatWithClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        Thread.sleep(4000);
        String actualIncorrectEmailErrorMessageText;
        actualIncorrectEmailErrorMessageText = driver.findElement(By.xpath("//p[text()='Error: email is incorrect']")).getText();
        System.out.println(actualIncorrectEmailErrorMessageText);
        Assert.assertEquals(actualIncorrectEmailErrorMessageText, "Error: email is incorrect");
        driver.close();
    }
    // USED SUBMIT() TO SUBMIT FORM
    @Test
    public void validateIncorrectEmailFormatWithSubmit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Log In']")).submit();
        Thread.sleep(4000);
        String actualIncorrectEmailErrorMessageText;
        actualIncorrectEmailErrorMessageText = driver.findElement(By.xpath("//span[text()='These credentials do not match our records.']"))
                .getText();
        Assert.assertEquals(actualIncorrectEmailErrorMessageText, "These credentials do not match our records.");
        driver.close();
    }
    @Test
    public void validateDefaultStateOfCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='log-in-button']/..")).click();
        boolean checkboxCheckedByDefault = driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected();
        Assert.assertEquals(checkboxCheckedByDefault, true);
        driver.close();
    }
}
