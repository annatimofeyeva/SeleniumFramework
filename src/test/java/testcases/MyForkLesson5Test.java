package testcases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SighUpPage;

public class MyForkLesson5Test extends BaseTest{
    @Test
    public void verifyJobTitlesInSighUpForm() throws InterruptedException {
        HomePage homepage = new HomePage(driver);
        homepage.clickSighUp();
        SighUpPage sighUpPage = new SighUpPage(driver);
        sighUpPage.verifyJobTitlesInSighUpForm();
    }
}
