package com.codegym;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
        super(color,filled,side,side);
    }
    public double getSide (){
        return this.getWidth();
    }
    public void setSide (double side){
        setSide(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with size : "
                +getSide()
                +", which is a subclass of "
                +super.toString();
    }
}
