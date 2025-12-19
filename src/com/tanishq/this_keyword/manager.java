package com.tanishq.this_keyword;
// BLC
public class manager {
    int managerId;
    String managerName;

    public void acceptData(int managerId, String managerName){
        this.managerId = managerId;
        this.managerName = managerName;
    }

    public void showData(){
        System.out.println("Manager id is: " + managerId);
        System.out.println("Manager name is: " + managerName);
    }
}
