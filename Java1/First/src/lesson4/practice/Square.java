package lesson4.practice;

public class Square implements IArea, IPerimeter {
    private int length;
    private int area;
    private int perimeter;
    public Square(int length){
        this.length = length;
    }
    @Override
    public void showArea(){
        area = this.length*this.length;
        System.out.println("正方形的面積為: " + area);
    }
    @Override
    public void showPerimeter(){
        perimeter = this.length*4;
        System.out.println("正方形的周長為: " + perimeter);
    }
}
