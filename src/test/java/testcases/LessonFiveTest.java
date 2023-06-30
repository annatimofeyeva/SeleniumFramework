package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.*;

public class LessonFiveTest extends BaseTest
{
    // Data structure practice
    @Test
    public void arrayPractice() {
        int[] arr = new int[3];
        arr[0]= 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr.length);
        String[] cars = new String[2];
        cars[0]= "BMW";
        cars[1] = "Ford";
        System.out.println(cars[1]);
        System.out.println(Arrays.asList(cars));
        //System.out.println(cars);
        List <Object> shoppinglist = new ArrayList<>();
        shoppinglist.add("Apple");
        shoppinglist.add("Bananas");
        shoppinglist.add("Pineapple");
        System.out.println(shoppinglist);

        List <Object> list = new ArrayList<>();
        list.add("String");
        list.add(123);
        list.add(false);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list.get(0));
        System.out.println(list.contains("String"));
        System.out.println(list.contains(100));

        Map<String, String> friendsWithProfessions = new HashMap<>();
        friendsWithProfessions.put("Adam", "Plumber");
        friendsWithProfessions.put("Alice", "Painter");
        friendsWithProfessions.put("Dylan", "Driver");
        System.out.println(friendsWithProfessions);
        System.out.println(friendsWithProfessions.get("Dylan"));
        friendsWithProfessions.remove("Adam");
        System.out.println(friendsWithProfessions);
        System.out.println(friendsWithProfessions.size());
    }
    // difference between driver.close() and driver.quit()
    // Handling Amazon dropdown
    @Test
    public void  closeOrQuite() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
    }
    @Test
    public void dropDown() {
        driver.get("https://www.amazon.com/");
        WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select searchOptions = new Select(searchDropDown);
        List<WebElement> options = new ArrayList<>();
        options = searchOptions.getOptions();
        System.out.println(options.get(0).getText());
        for(int i =0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
    }
}
