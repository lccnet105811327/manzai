package lesson2;

public class Loop {
    public int n;
    public String sum;
    public String r = "1";

    public Loop(int n) {
        for (int i = 2; i <= n; i++) {
            sum = r;
            this.r = i + sum + i;
        }
    }
}
