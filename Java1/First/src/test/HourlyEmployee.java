package test;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hours;

    public HourlyEmployee(String name, String mobile, int wage, int hours) {
        super(name, mobile);
        this.wage = wage;
        this.hours = hours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        if (wage < 0) {
            System.out.println("請重設為大於或等於0的值");
        } else {
            this.wage = wage;
            System.out.println("您新設的時薪: " + this.wage);
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            System.out.println("請重設為大於或等於0的值");
        } else {
            this.hours = hours;
            System.out.println("您新設的時數: " + this.hours);
        }
    }
    
    @Override
    public void earnings() {
        int earnings = this.wage * this.hours;
        System.out.println("未扣稅所得: " + earnings);
    }

    @Override
    public void getTax() {
        double tax = this.wage * this.hours * 0.05;
        System.out.println("取的稅額: " + tax);
    };

    @Override
    public void getPaymentAmount() {
        int earnings = this.wage * this.hours;
        double tax = this.wage * this.hours * 0.05;
        System.out.println("扣稅後應付金額: " + (earnings - tax));
    };

    @Override
    public String toString() {
        return "此HourlyEmployee的姓名為: " + super.getName() + "，手機號碼為:" + super.getMobile();
    }
}
