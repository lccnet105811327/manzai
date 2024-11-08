package test;

public class PaymentSystem {
    public static void main(String[] args) {
        Employee h1 = new HourlyEmployee("John","0965482296",220,40);
        System.out.println(h1.toString());
        h1.earnings();
        h1.getTax();
        h1.getPaymentAmount();
        System.out.println("============================================================");

        Employee s1 = new SalariedEmployee("Jake","0961282876", 50000,0.1,2000);
        System.out.println(s1.toString());
        s1.earnings();
        s1.getTax();
        s1.getPaymentAmount();
        System.out.println("============================================================");

        Employee c1 = new CommissionEmployee("Jay","0933672546",50000,0.1,2000);
        System.out.println(c1.toString());
        c1.earnings();
        c1.getTax();
        c1.getPaymentAmount();
        System.out.println("============================================================");

        Employee b1 = new BasePlusCommissionEmployee("Joe","0926671564",50000,0.1,2000);
        System.out.println(b1.toString());
        b1.earnings();
        b1.getTax();
        b1.getPaymentAmount();

    }   
}
