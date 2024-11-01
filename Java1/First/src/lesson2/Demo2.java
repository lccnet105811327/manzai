package lesson2;
import lesson2.dev.one.Animal1; //資料夾路徑到檔案，在檔案裡的類別要加上public才可使用
// import Lesson2.dev2.two.Animal2;
// import Lesson1.*; //全部一起匯入

public class Demo2 {
    public static void main(String[] args) throws Exception {
        
        Animal1 animal1 = new Animal1("dog");
        animal1.printInfo();
        lesson2.dev2.two.Animal2 animal2 = new lesson2.dev2.two.Animal2("dog"); //取名若完全相同只能個別打出完整的路徑，無法用import一次匯入
        animal2.printInfo();
        
        Circle moon1 = new Circle(5,3.14);
        moon1.show_area();
        Circle moon2 = new Circle(5,3);
        moon2.show_area();
        Loop n1 = new Loop(5);
        System.out.println(n1.r);

        Bank1 myBank1 = new Bank1();
        System.out.println(myBank1.getMoney());
    }
}
