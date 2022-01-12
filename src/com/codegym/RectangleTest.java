package com.codegym;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4.0 , 6.0);
        System.out.println(rectangle);

        rectangle = new Rectangle("black",true,2.0,4.0);
        System.out.println(rectangle);
    }
}
