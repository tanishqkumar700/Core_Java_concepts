package com.tanishq.object_reference;
//ELC
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeNumber(111);
        e1.setEmployeeName("Tanishq");

        Manager m1 = new Manager(e1);
        System.out.println(m1);

    }

}
