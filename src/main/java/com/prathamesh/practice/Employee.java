package com.prathamesh.practice;

import java.util.Objects;

public class Employee {
    private long empId;
    private String empName;
    private String empAddress;
    private String empDesignation;
    private String email;
    private String mobileNo;

    public Employee(String empName, String empAddress, String empDesignation, String email, String mobileNo, long empId) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDesignation = empDesignation;
        this.email = email;
        this.mobileNo = mobileNo;
        this.empId = empId;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empAddress, employee.empAddress) && Objects.equals(empDesignation, employee.empDesignation) && Objects.equals(email, employee.email) && Objects.equals(mobileNo, employee.mobileNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empAddress, empDesignation, email, mobileNo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
