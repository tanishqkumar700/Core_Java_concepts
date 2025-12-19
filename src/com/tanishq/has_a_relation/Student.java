package com.tanishq.has_a_relation;
//BLC
public class Student {
    private int studentId;
    private String studentName;
    //HAS-A RELATION
    private College college;  // REFERENCE VARIABLE WHICH IS INSTANCE TYPE VARIABLE HERE.

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", college=" + college +
                '}';
    }
//    public void showStudentData(){
//        System.out.println("Student ID is: " + this.studentId);
//        System.out.println("Student Name is: " + this.studentName);
//        System.out.println("College name is: " + this.college.getCollegeName());
//        System.out.println("College location is: " + this.college.getCollegeLocation());
//    }
}
