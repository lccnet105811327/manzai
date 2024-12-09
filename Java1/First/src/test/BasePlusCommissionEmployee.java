package test;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    public BasePlusCommissionEmployee(String name, String mobile, int grossSales, double commissionRate, int baseSalary) {
        super(name, mobile, grossSales, commissionRate*1.3, baseSalary);
    }

    @Override
    public double earnings() {
        double earnings = super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery();
        return earnings;
    }

    @Override
    public double getTax() {
        double tax = (super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery()) * 0.05;
        return tax;
    };

    @Override
    public double getPaymentAmount() {
        double earnings = super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery();
        double tax = (super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery()) * 0.05;
        return (earnings - tax);
    };

    @Override
    public String toString() {
        return "此BasePlusCommissionEmployee員工的姓名為: " + super.getName() + "，手機號碼為:" + super.getMobile();
    }
}
