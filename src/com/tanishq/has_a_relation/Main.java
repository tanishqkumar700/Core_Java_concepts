package com.tanishq.has_a_relation;
//ELC
public class Main {
    public static void main(String[] args) {
        College c1 = new College("KIET University", "Muradnagar, Ghaziabad");

        Student s1 = new Student(193, "Tanishq", c1);
        //s1.showStudentData();
        System.out.println(s1);

        Student s2 = new Student(116, "Manas", c1);
        //s2.showStudentData();
        System.out.println(s2);
    }
}



