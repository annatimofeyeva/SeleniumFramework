package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    // Lesson2: Selenium overview
    @Test
    public void openWebsite() {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        // I connected Java 11 to the Project, so I have to add ChromeOptions below
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    // Selenium WebDriver element interaction lesson
    @Test
    public void openSighInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.close();
    }

    @Test
    public void fillEmailAndPasswordField() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void fillEmailAndPasswordFieldAndPressEnter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void validateSignInError() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@aria-label = 'Error']")).isDisplayed());
        // Error message: "Sorry, something went wrong. Please try again."
        driver.close();
    }
    @Test
    public void validateCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("cia-remember-me")).isSelected());
        driver.close();
    }
    @Test
    public void validateCheckboxText() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//label[@for='cia-remember-me']")).getText());
        System.out.println();
        driver.close();
    }
    @Test
    public void isEnable() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG");
        driver.manage().window().maximize();
        driver.findElement(By.id("A1000")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//button[text()='Cancel']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[text()='Next']")).isEnabled());
        driver.close();
    }
    // Lesson2: Selenium overview (live session) - Wikipedia Example
    @Test
    public void openWikipedia() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.close();
    }
    @Test
    public void automateLoginInWithClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//li[@id='pt-login-2']//a")).click();
        driver.findElement(By.id("wpName1")).sendKeys("username");
        driver.findElement(By.id("wpPassword1")).sendKeys("123456");
        driver.findElement(By.id("wpLoginAttempt")).click();
        driver.close();
    }

    @Test
    public void automateLoginInWithEnter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//li[@id='pt-login-2']//a")).click();
        driver.findElement(By.id("wpName1")).sendKeys("username");
        driver.findElement(By.id("wpPassword1")).sendKeys("123456");
        driver.findElement(By.id("wpLoginAttempt")).sendKeys(Keys.ENTER);
        driver.close();
    }
    @Test
    public void automateLoginInAndClearForm() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//li[@id='pt-login-2']//a")).click();
        driver.findElement(By.id("wpName1")).sendKeys("username");
        Thread.sleep(3000);
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("123456");
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpLoginAttempt")).sendKeys(Keys.ENTER);
        driver.close();
    }
    @Test
    public void verifyUsernameIsDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//li[@id='pt-login-2']//a")).click();
        System.out.println(driver.findElement(By.id("wpName1")).isDisplayed());
        driver.close();
    }
    @Test
    public void verifyErrorMessage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//li[@id='pt-login-2']//a")).click();
        driver.findElement(By.id("wpName1")).sendKeys("username");
        driver.findElement(By.id("wpPassword1")).sendKeys("123456");
        driver.findElement(By.id("wpLoginAttempt")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[@id='userloginForm']//form/div[1]")).getText());
        driver.close();
    }
    @Test
    public void verifyUsernameClassVAlue() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/anya/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//li[@id='pt-login-2']//a")).click();
        System.out.println(driver.findElement(By.id("wpName1")).getAttribute("class"));
        driver.close();
    }
}

