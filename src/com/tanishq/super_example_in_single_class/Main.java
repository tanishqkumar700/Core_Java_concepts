package com.tanishq.super_example_in_single_class;

class Shape{
    protected int x;
    public Shape(int x){
        this.x = x;
        System.out.println("X value is: " + x);
    }
}

class Square extends Shape{
    public Square(int y){
        super(y);
    }
    public void areaOfSquare(){
        System.out.println("Area of square is: "+ (x*x));
    }
}

class Rectangle extends Square{
    protected int b;
    public Rectangle(int l, int b){
        super(l);
        this.b = b;
    }
    public void areaOfRectangle(){
        System.out.println("Area of Rectangle is: "+ (x*b));
    }
}

public class Main {
    public static void main(String[] args) {
        Square s = new Square(10);
        s.areaOfSquare();

        Rectangle r = new Rectangle(5,4);
        r.areaOfRectangle();
    }
}
