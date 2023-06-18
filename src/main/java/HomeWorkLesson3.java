public class HomeWorkLesson3 {

    public static void main(String[] args) {
        dynamicallyPrintGreeting(args);
        mathCalc();
        printTax(11000);
        printWorkingHours("marketing");
        printEachSecondHour();
    }

    /*Values for arguments to dynamicallyPrintGreeting(String args[]) are provided via CLI
    or via Run/Edit Configurations/Program Arguments*/
/*  PROGRAM OUTPUT:
    Greetings from:
    Username: John Doe
    Age: 34
    Location: = WA
    Product name: Furniture
    Price: = 999.99
*/
    public static void dynamicallyPrintGreeting(String args[]) {
        String username = args[0];
        int age = Integer.parseInt(args[1]);
        String location = args[2];
        String product_name = args[3];
        double price = Double.parseDouble(args[4]);
        System.out.println(
                "Greetings from: " + "\n" +
                "Username: " + username + "\n" +
                "Age: " + age + "\n" +
                "Location: = " + location + "\n" +
                "Product name: " + product_name + "\n" +
                "Price: = " + price);
    }
    public static void mathCalc() {
        int a = 100;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
    public static void printTax(int income) {
        if (income >= 0 && income <= 10275) {
            System.out.println("Your tax will be 10%");
        } else if (income >= 10276 && income <= 41775) {
            System.out.println("Your tax will be 12%");
        } else if (income >= 41776 && income <= 89075) {
            System.out.println("Your tax will be 22%");
        } else {
            System.out.println("Please call your CPA");
        }
    }
    public static void printWorkingHours(String department) {
        switch (department) {
            case "sales":
                System.out.println("Sales department works from 8am to 12pm.");
            case "operations":
                System.out.println("Operation department works from 6am to 12pm.");
            case "marketing":
                System.out.println("Marketing department works from 10am to 5pm.");
        }
    }
    public static void printEachSecondHour() {
        for (int i = 0; i <= 24; i = i + 2) {
            System.out.println(i);
        }
    }
}

