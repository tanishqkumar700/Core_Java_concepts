package com.tanishq.first_oop;

//EXECUTABLE LOGIC CLASS

public class Main {
    public static void main(String[] args)
    {
        customer Tanishq = new customer();
        Tanishq.displayData();
        Tanishq.acceptData("Tanishq Kumar", 12000);
        Tanishq.displayData();

        customer Riya = new customer();
        Riya.acceptData("Riya Maurya", 10000);
        Riya.displayData();

    }
}
