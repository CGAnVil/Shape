package com.codegym;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("orange" , false);
        System.out.println(shape);
    }
}
