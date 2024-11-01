package lesson1;
public class Work {
    public String authorName;
    public String dateMade;
    public int priceOffer;
    public boolean registeredOrNot;
    public static String company = "AAA";

    public Work(String author, String date, int price, boolean registered){
        this.authorName = author;
        this.dateMade = date;
        this.priceOffer = price;
        this.registeredOrNot = registered;
    }
    public void printInfo(){
        System.out.println("author name: " + authorName);
        System.out.println("date made: " + dateMade);
        System.out.println("offered price: " + priceOffer);
        System.out.println("registered or not: " + registeredOrNot);
    }
    public static void printCompany(){
        System.out.println("company name is " + company);
    }
}
