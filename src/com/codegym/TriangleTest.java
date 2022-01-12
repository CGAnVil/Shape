package com.codegym;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3,3,3);
        System.out.println(triangle);

        triangle = new Triangle("blue", false, 5,6,7);
        System.out.println(triangle);
    }
}
