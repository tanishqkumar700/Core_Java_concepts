package com.tanishq.method_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(4,5));
        System.out.println(a.add(4,5,6));
        System.out.println(a.add(4.5f,5.4f));
        System.out.println(a.add(4.5f,5.4f,6.3f));
    }
}
