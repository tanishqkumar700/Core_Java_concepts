package com.tanishq.object_reference;
//BLC
public class Manager {
    private int managerId;
    private String managerName;

    public Manager(Employee e){
        managerId = e.getEmployeeNumber();
        managerName = e.getEmployeeName();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
