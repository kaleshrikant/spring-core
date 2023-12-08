package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("studentBean")
public class Student {
    @Value("Shrikant")
    private String firstName;
    @Value("Kale")
    private String lastName;
    @Value("Amravati")
    private String city;

    private Samosa samosa;

    public Student() {
    }

    public Student(String firstName, String lastName, String city, Samosa samosa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.samosa = samosa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        this.samosa.display();
        System.out.println("Student is reading book");
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", samosa=" + samosa +
                '}';
    }
}
