package _231221.abstractClass;

import _231214.message.C;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("빨간색", 2.2);
        Rectangle rectangle = new Rectangle("노란색", 2, 4);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
