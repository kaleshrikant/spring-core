package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired //  Error :- expected single matching bean but found 2: address1,address2
    @Qualifier("address2")
    // @Qualifier("address3") Error :- No qualifying bean of type 'com.spring.core.Address' available:
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
