package com.spring.core;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        System.out.println("Employee() : setting address");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setAddress() : setting address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
