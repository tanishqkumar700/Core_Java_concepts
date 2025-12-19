package com.tanishq.encapsulation;

public class Student {
   private int rollNumber; //  DATA HIDING

    public void setRollNumber(int rollNumber) { // SETTER
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {  // GETTER
        return rollNumber;
    }
}
