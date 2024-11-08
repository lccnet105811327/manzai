package lesson4;
import lesson4.practice.*;
public class Demo {
    public static void main(String[] args) {
        // ================================== 抽象&介面範例1開始 ================================
        System.out.println("============================================================");
        // SpecialDog spDog1 = new SpecialDog();
        // spDog1.eat();
        // spDog1.sleep();
        // spDog1.catchTheBall();
        // spDog1.showAge();
        // ================================== 抽象&介面範例1結束 ================================

        FoodCabinet fridge1 = new Fridge("Small");
        fridge1.showSize();
        
        // ================================== 抽象&介面範例2開始 ================================
        System.out.println("============================================================");
        Fridge fridge = new Fridge("Big");
        fridge.preserveFoods();
        fridge.usePower();
        fridge.refrigerate();
        fridge.showSize();
        fridge1.showSize(); //即使值是存在父類別，仍可以保有各自的值

        System.out.println("============================================================");

        // Oven oven = new Oven();
        // oven.usePower();
        // oven.heatFood();
        // ================================== 抽象&介面範例2結束 ================================

        System.out.println("============================================================");

        Circle circle1 = new Circle(5);
        circle1.showShapeInfo();
        circle1.showArea();
        circle1.showPerimeter();

        Square square1 = new Square(6);
        square1.showArea();
        square1.showPerimeter();
    }

}
