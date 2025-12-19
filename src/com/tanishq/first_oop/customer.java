package com.tanishq.first_oop;

// BUSINESS LOGIC CLASS

public class customer
{
    String customerName;
    double customerBill;

    public void acceptData(String name, double bill)
    {
        customerName = name;
        customerBill = bill;
    }

    public void displayData()
    {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Bill: " + customerBill);
    }
}
