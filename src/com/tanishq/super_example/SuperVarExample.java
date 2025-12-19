package com.tanishq.super_example;
// SUPER CLASS VARIABLE CALL EXAMPLE
class Father {
    protected int balance = 50000;
}

class Son extends Father{
    int balance = 12000;

    public Son(){
        System.out.println("Son balance is: " + balance);
        System.out.println("Father balance is: " + super.balance);
    }
}

public class SuperVarExample{
    public static void main(String[] args) {
        new Son();  // NAMELESS OR ANONYMOUS OBJECT
        Son s1 = new Son();

    }
}