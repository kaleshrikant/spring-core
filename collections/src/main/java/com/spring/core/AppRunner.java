package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = (Employee) classPathXmlApplicationContext.getBean("employee");

        System.out.println(employee);
    }
}
