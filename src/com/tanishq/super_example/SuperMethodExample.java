package com.tanishq.super_example;

class Super{
    public void show(){
        System.out.println("Show Method of Super Class");
    }
}

class Sub extends Super{

    public void show(){
        super.show();
        System.out.println("Show Method of Sub Class");
    }
}

public class SuperMethodExample {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        s1.show();

    }
}
