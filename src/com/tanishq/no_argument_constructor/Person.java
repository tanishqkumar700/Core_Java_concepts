package com.tanishq.no_argument_constructor;

public class Person {
    private int personId;
    private String personName;

    public Person(){
        personId = 111;
        personName = "Tanishq";
    }
    public void showPersonData(){
        System.out.println("Person id is: " + personId);
        System.out.println("Person name is: " + personName);
    }
}
