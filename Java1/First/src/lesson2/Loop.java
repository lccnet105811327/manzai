package lesson2;

public class Loop {
    public int n;
    public String sum;
    public String r = "1";
    String r1 = "      ";

    public Loop(int n) {
        this.n = n;
    }

    public void paint() {
        System.out.print("        1");
        System.out.println();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(r1);
                r1 = r1.replace("  ","");
            }
            sum = r;
            this.r = i + sum + i;
            System.out.print(r);
            System.out.println();
        }
    }
}
