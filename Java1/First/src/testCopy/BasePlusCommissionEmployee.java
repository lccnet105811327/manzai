package testCopy;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    public BasePlusCommissionEmployee(String name, String mobile, int grossSales, double commissionRate, int baseSalary) {
        super(name, mobile, grossSales, commissionRate*1.3, baseSalary);
    }

    @Override
    public void earnings() {
        double earnings = super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery();
        System.out.println("未扣稅所得: " + earnings);
    }

    @Override
    public void getTax() {
        double tax = (super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery()) * 0.05;
        System.out.println("取得稅額: " + tax);
    };

    @Override
    public void getPaymentAmount() {
        double earnings = super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery();
        double tax = (super.getGrossSales() * super.getCommissionRate() + super.getBaseSalery()) * 0.05;
        System.out.println("扣稅後應付金額: " + (earnings - tax));
    };

    @Override
    public String toString() {
        return "此BasePlusCommissionEmployee員工的姓名為: " + super.getName() + "，手機號碼為:" + super.getMobile();
    }
}
