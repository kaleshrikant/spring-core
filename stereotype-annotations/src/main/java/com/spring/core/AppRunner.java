package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

       // Student student = applicationContext.getBean("student", Student.class);

        Student student = applicationContext.getBean("studentOjbect", Student.class);
        System.out.println(student);
    }
}
