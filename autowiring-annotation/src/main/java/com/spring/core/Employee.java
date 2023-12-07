package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;

    public Employee() {
    }

    @Autowired
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
