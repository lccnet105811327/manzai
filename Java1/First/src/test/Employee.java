package test;

public class Employee extends Earning implements IPayable, IInvoice{
    private String name;
    private String mobile;

    Employee(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("請輸入空白以外的文字");
        } else {
            this.name = name;
            System.out.println("重設的姓名為" + this.name);
        }
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        if (name == "") {
            System.out.println("請輸入空白以外的號碼");
        } else {
            this.mobile = mobile;
            System.out.println("重設的手機號碼為" + this.mobile);
        }
    }
    public void callAll(Employee n){
        System.out.println(n.toString());
        System.out.println("未扣稅所得: " + n.earnings());
        System.out.println("取得稅額: " + n.getTax());
        System.out.println("扣稅後應付金額: " + n.getPaymentAmount()); 
    }

    @Override
    public double earnings(){
        return 0;
    };

    @Override
    public double getTax(){
        return 0;
    };

    @Override
    public double getPaymentAmount(){
        return 0;
    };
    
    @Override
    public String toString() {
        return "";
    }

}
