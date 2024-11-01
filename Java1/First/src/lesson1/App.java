package lesson1;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String testString = test();
        System.out.println(testString);
        System.out.println(test());
        String testString1 = test1(1, 2);
        System.out.println(testString1);
        int startEndNumTotal = total(1, 10);
        System.out.printf("%d", startEndNumTotal);
        System.out.println("");
        System.out.println(total(2, 30));
        printOnlyString ("Print Only");
    }

    public static String test() {
        String rString = "test";
        return rString;
    }
    public static String test1(int num1, int num2) {
        String rString1 = "test1";
        return rString1;
    }
    public static int total(int num1, int num2) {
        int total = 0;
        for(int index = num1; index <= num2; index++) {
            total = total + index;
        }
        return total;
    }
    static void printOnlyString (String typeString) {
        System.out.println(typeString);
    }
}
