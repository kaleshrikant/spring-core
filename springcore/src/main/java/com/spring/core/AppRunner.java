package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1);
    }
}
