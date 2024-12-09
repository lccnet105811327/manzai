package test;

public class PaymentSystem {
    public static void main(String[] args) {
        Employee h1 = new HourlyEmployee("John","0965482296",220,40);
        h1.callAll(h1);
        System.out.println("============================================================");

        Employee s1 = new SalariedEmployee("Jake","0961282876", 50000,0.1,2000);
        s1.callAll(s1);
        System.out.println("============================================================");

        Employee c1 = new CommissionEmployee("Jay","0933672546",50000,0.1,2000);
        c1.callAll(c1);
        System.out.println("============================================================");

        Employee b1 = new BasePlusCommissionEmployee("Joe","0926671564",50000,0.1,2000);
        b1.callAll(b1);
        System.out.println("============================================================");
    }   
}
