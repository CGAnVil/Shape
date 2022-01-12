package com.codegym;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getArea(){
        return Math.sqrt(getPerimeter() * (getPerimeter() - side1)* (getPerimeter() - side2)* (getPerimeter() - side3));
    }

    @Override
    public String toString(){
        return "A triangle has side 1 = "
                + side1
                +" side 2 = "
                +side2
                +" side 3 = "
                +side3
                +" Perimeter = "
                +getPerimeter()
                +" Area = "
                +getArea()
                +super.toString();
    }
}
