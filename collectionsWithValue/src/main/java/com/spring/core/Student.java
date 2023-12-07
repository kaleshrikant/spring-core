package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentOjbect")
public class Student {
    @Value("Shrikant Kale")
    private String studentName;
    @Value("Amravati")
    private String city;

    @Value("#{addressListRef}")
    private List<String> adresses;

    public Student() {
    }

    public Student(String studentName, String city, List<String> adresses) {
        this.studentName = studentName;
        this.city = city;
        this.adresses = adresses;
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

    public List<String> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<String> adresses) {
        this.adresses = adresses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", adresses=" + adresses +
                '}';
    }
}
