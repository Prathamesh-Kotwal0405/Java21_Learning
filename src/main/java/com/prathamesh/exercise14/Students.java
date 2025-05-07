package com.prathamesh.exercise14;

public class Students {
    private long studentId;
    private String studentName;
    private String StudentAddress;
    private String StudentClass;

    public Students(long studentId, String studentClass, String studentAddress, String studentName) {
        this.studentId = studentId;
        StudentClass = studentClass;
        StudentAddress = studentAddress;
        this.studentName = studentName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String studentClass) {
        StudentClass = studentClass;
    }
}
