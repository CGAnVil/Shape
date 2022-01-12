package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter information of the triangle");
        System.out.println("Triangle color is:");
        String color = sc.nextLine();
        System.out.println("Is triangle filled? Y/N");
        String answer = sc.nextLine();
        Boolean filled;
        if (answer == "Y") {
            filled = true;
        } else {
            filled = false;
        }

        System.out.println("Side 1 is:");
        double side1 = sc.nextDouble();
        System.out.println("Side 2 is:");
        double side2 = sc.nextDouble();
        System.out.println("Side 3 is:");
        double side3 = sc.nextDouble();
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            Triangle triangle = new Triangle(color, filled, side1, side2, side3);
            System.out.println(triangle);
        } else {
            System.out.println("3 value you entered cant not be a triangle");
        }
    }
}
