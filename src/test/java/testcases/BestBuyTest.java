package testcases;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SighInPage;

public class BestBuyTest extends BaseTest
{
    @Test
    public void openSighInPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickSighIn();
    }
    @Test
    public void fillSighInFormBySubmit() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SighInPage sighInPage = new SighInPage(driver);
        homePage.clickSighIn();
        sighInPage.fillSighInFormBySubmit();
    }
    @Test
    public void fillSighInFormByClick() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SighInPage sighInPage = new SighInPage(driver);
        homePage.clickSighIn();
        sighInPage.fillSighInFormByClick();
    }
   @Test
    public void fillSighInFormByPressEnter() throws InterruptedException {
       HomePage homePage = new HomePage(driver);
       SighInPage sighInPage = new SighInPage(driver);
       homePage.clickSighIn();
       sighInPage.fillSighInFormByPressEnter();
   }
   @Test
    public void validateDefaultStateOfCheckbox() throws InterruptedException {
       HomePage homePage = new HomePage(driver);
       SighInPage sighInPage = new SighInPage(driver);
       homePage.clickSighIn();
       sighInPage.validateDefaultStateOfCheckbox();
   }
}

