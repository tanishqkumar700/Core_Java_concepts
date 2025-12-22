package com.tanishq.super_example;

class A{
    public A(){
        System.out.println("class A No-argument constructor");
    }
}

class B extends A{
    public B(){
        System.out.println("class B No-argument constructor");
    }
}

public class CallingNoArgument {
    public static void main(String[] args) {
        B b1 = new B();

    }

}
