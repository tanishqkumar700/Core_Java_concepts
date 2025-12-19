package com.tanishq.has_a_relation;
// BLC
public class College {
    private String collegeName;
    private String collegeLocation;

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLocation() {
        return collegeLocation;
    }

    public College(String collegeName, String collegeLocation) {
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", collegeLocation='" + collegeLocation + '\'' +
                '}';
    }
}
