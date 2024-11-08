package lesson4.practice;

public class Circle extends Shape implements IArea, IPerimeter {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(int radius){
        this.radius = radius;
    }
    
    @Override
    public void showShapeInfo(){
        System.out.println("這是一個圓形，半徑為: "+ radius); 
    };

    @Override
    public void showArea(){
        area = this.radius*this.radius*3.14;
        System.out.println("圓形面積為: " + this.area); 
    };

    @Override
    public void showPerimeter(){
        perimeter = (this.radius*2)*3.14;
        System.out.println("圓形周長為: " + this.perimeter); 
    };
}
