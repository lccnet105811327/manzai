package lesson1;
public class Demo {
    public static void main(String[] args) throws Exception {
        // 實作(實體化)類別(Class) 變成物件(Object)
        Person1 person1 = new Person1("Edward");
        Person1 person2 = new Person1("David");

        // 取出物件的屬性
        System.out.println(person1.personName);
        System.out.println(person2.personName);

        // 設定物件的屬性
        person1.personName = "Edward1";
        person2.personName = "David1";

        // 物件呼叫方法
        person1.showName();
        person2.showName();

        // 靜態屬性呼叫
        System.out.println(Person1.personCount);

        // 靜態方法呼叫
        Person1.callPersonCountWithStatic();
        System.out.println(Person1.callPersonCount());

        // 實作(實體化)類別(Class) 變成物件(Object)
        Car car1 = new Car("001", "blue", false, 10);
        Car car2 = new Car("002", "yellow", true, 20);
        Car car3 = new Car("003", "red", false, 15);
        Car car4 = new Car("004", "black", false, 30);

        // 物件呼叫方法
        car1.showCarInfo();
        car2.showCarInfo();
        car3.showCarInfo();
        car4.showCarInfo();

        // 靜態方法呼叫
        Car.showCompanyWithStatic();

        // practice
        Work work1 = new Work("Madeleine", "10/30", 600000, true);
        Work work2 = new Work("Natasha", "12/06", 1900000, false);
        Work work3 = new Work("Ru", "03/24", 1600000, true);
        Work work4 = new Work("Korey", "05/04", 1800000, true);

        work1.printInfo();
        work2.printInfo();
        work3.printInfo();
        work4.printInfo();

        Work.printCompany();
    }
}
