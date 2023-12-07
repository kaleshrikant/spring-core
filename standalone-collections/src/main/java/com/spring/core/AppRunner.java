package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Person personBean = (Person) applicationContext.getBean("personBean");
            System.out.println(personBean);
        System.out.println(personBean.getFriendList().getClass().getName());
        System.out.println(personBean.getFeeStructureMap().getClass().getName());
        System.out.println(personBean.getDbProperties().getClass().getName());
    }
}
