package com.tanishq.method_overriding;

class Animal{
    public void eat(){
        System.out.println("Animal is Eating.");
    }
}
class Lion extends Animal{
    public void eat(){
        System.out.println("Non-Veg");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Lion(); // UPCASTING
        a.eat();
        Lion l = (Lion) new Animal(); // DOWNCASTING
        l.eat(); // CLASSCAST EXCEPTION
    }
}
