package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentOjbect")
public class Student {
    @Value("Shrikant Kale")
    private String studentName;
    @Value("Amravati")
    private String city;

    public Student() {
    }

    public Student(String studentName, String city) {
        this.studentName = studentName;
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
