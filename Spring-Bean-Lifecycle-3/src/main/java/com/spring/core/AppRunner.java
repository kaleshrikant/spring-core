package com.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {

        AbstractApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");

        Example example = (Example) classPathXmlApplicationContext.getBean("exampleBean");

            // registring shutdownHook
        classPathXmlApplicationContext.registerShutdownHook();
    }
}