package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");

        A aRef = (A) classPathXmlApplicationContext.getBean("aRef");

        System.out.println(aRef);
    }
}
