package com.tanishq.super_example_constructor;

import java.util.Scanner;

//ELC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();

        Square s = new Square(side);
        s.areaOfSquare();
    }
}
