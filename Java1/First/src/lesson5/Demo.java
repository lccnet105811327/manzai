package lesson5;
//interface只需被用一次時可用匿名類別
public class Demo {
    public static void main(String[] args) {

        //有新增子類別的使用:

        //新增原本不在介面的方法時
        // 1.直接使用
        new Person(){
            public void fly() {
                System.out.println("I can fly.");
            }
        }.fly();

        // 2.無法用其他method呼叫
        // personFly(new IRun() {
        //         public void fly() {
        //             System.out.println("I can fly. --- extends");
        //         }
        //     });



        // 無新增子類別:

        // 1.直接使用(只選一個呼叫)
        new IRun(){
            //一定要先覆寫原本的
            @Override
            public void run(String name){
                System.out.println("I can run fast.");
            }
            //可新增原本不在介面的方法
            public void fly(){
                System.out.println("I can fly.");
            }
        }.fly();

        //2.用另一個method呼叫，覆寫在main裡面
        //一般寫法
        runMethod1(
            new IRun() {
                public void run(String name){
                    System.out.println(name + " can run fast.");
                }
            }
        );
        // lambda一行搞定(只能interface才能使用)
        runMethod2((String name) -> System.out.println(name + " can run fast. -- lambda"));
       
    }

    //創方法+呼叫在外面，r算是new一個IRun類別的概念
    public static void runMethod1(IRun r){
        r.run("Jordan");
    }
    public static void runMethod2(IRun r) {
        r.run("David1");
    }

    }

