package lesson2;

public class Circle {
    public double pi;
    public int radius;
    
    public Circle(int getRadius, double getPi){
        this.radius = getRadius;
        this.pi = getPi;
    }
    public void show_area(){
        System.out.println(pi*radius*radius);
    }
}
