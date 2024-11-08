package test;

public class SalariedEmployee extends Employee {
    private int grossSales;
    private double commissionRate;
    private int baseSalary;

    public SalariedEmployee(String name, String mobile, int grossSales, double commissionRate, int baseSalary) {
        super(name, mobile);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        if (grossSales < 0) {
            System.out.println("請重設為大於或等於0的值");
        } else {
            this.grossSales = grossSales;
            System.out.println("您新的總銷售額: " + this.grossSales);
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0) {
            System.out.println("請重設為大於或等於0的值");
        } else {
            this.commissionRate = commissionRate;
            System.out.println("您新設的佣金率: " + this.commissionRate);
        }
    }

    public int getBaseSalery() {
        return baseSalary;
    }

    public void setBaseSalery(int baseSalary) {
        if (baseSalary < 0) {
            System.out.println("請重設為大於或等於0的值");
        } else {
            this.baseSalary = baseSalary;
            System.out.println("您新設的佣金率: " + this.baseSalary);
        }
    }

    @Override
    public void earnings() {
        double earnings = this.grossSales * this.commissionRate + this.baseSalary;
        System.out.println("未扣稅所得: " + earnings);
    }

    @Override
    public void getTax() {
        double tax = (this.grossSales * this.commissionRate + this.baseSalary) * 0.05;
        System.out.println("取的稅額: " + tax);
    };

    @Override
    public void getPaymentAmount() {
        double earnings = this.grossSales * this.commissionRate + this.baseSalary;
        double tax = (this.grossSales * this.commissionRate + this.baseSalary) * 0.05;
        System.out.println("扣稅後應付金額: " + (earnings - tax));
    };

    @Override
    public String toString() {
        return "此SalariedEmployee的姓名為: "+ super.getName() + "，手機號碼為:" + super.getMobile();
    }
}
