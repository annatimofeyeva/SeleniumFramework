package testcases;
import org.testng.annotations.Test;
import java.util.*;

public class LessonFiveTest extends BaseTest
{
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
}
