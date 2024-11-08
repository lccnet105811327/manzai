package lesson5;
//匿名類別，只能被用一次
public class Demo {
    public static void main(String[] args) {

        //有新增子類別的使用:
        // 1.匿名類別定義新method可直接使用
        new Person(){
            public void fly() {
                System.out.println("I can fly. --- extends");
            }
        }.fly();

        // 2.匿名類別定義新method無法用其他method呼叫
        // personFly(new IRun() {
        //         public void fly() {
        //             System.out.println("I can fly. --- extends");
        //         }
        //     });

        // 直接使用:
        //用類別呼叫另一個類別，呼叫在main裡面
        // lambada一行搞定(只能interface才能使用)
        runMethod1((String name) -> System.out.println(name + " can run fast. -- lambda"));
       
    }

    //創方法在外面，r算是new一個IRun類別的概念
    public static void runMethod1(IRun r) {
        r.run("David1");
    }

    }

