package _231221.abstractClass;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public Double area() {
        return (double) length *  width;
    }
    @Override
    public String toString() {
        return "사각형 색상은 " + getColor() + " 그리고 면적은 : " + area();
    }

}
