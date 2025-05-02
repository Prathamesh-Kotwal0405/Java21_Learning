package com.prathamesh.practice;

public final class Customer {
    private final long customerId;
    private final String firstName;
    private final String LastName;
    private final long mobileNo;
    private final String address;

    public Customer(long customerId, String address, long mobileNo, String lastName, String firstName) {
        this.customerId = customerId;
        this.address = address;
        this.mobileNo = mobileNo;
        LastName = lastName;
        this.firstName = firstName;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public String getLastName() {
        return LastName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public String getFirstName() {
        return firstName;
    }
}
