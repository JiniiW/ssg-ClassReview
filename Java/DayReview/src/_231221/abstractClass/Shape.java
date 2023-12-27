package _231221.abstractClass;

public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }
    //toString은 반환값 String을 받아야 한다.
    public abstract String toString();
    public abstract Double area();

    public String getColor() {
        return color;
    }

}
