package com.tanishq.inheritance_example;

public class PermanentEmployee extends TemporaryEmployee{
    private String department;
    private String designation;

    public void acceptData(){
        department = "CSIT";
        designation = "Professor";
    }

    public void showData(){
        System.out.println("Employee number is:" + employeeNumber);
        System.out.println("Employee name is:" + employeeName);
        System.out.println("Employee address is:" + employeeAddress);
        System.out.println("Department is:" + department);
        System.out.println("Designation is:" + designation);

    }
}
