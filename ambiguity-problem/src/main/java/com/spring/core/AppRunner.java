package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// The constructor injectin ambiguity can be resolved by specifing type and order (index).
public class AppRunner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");

        Addition addition = (Addition) classPathXmlApplicationContext.getBean("addBean");
            addition.sum();
    }
}
