package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Student student1 = applicationContext.getBean("studentObject", Student.class);
        Student student2 = applicationContext.getBean("studentObject", Student.class);

        System.out.println("Hash code of student1 : "+student1.hashCode());
        System.out.println("Hash code of student2 : "+student2.hashCode());

        /*  Hash code of student1 : 1708169732
        *   Hash code of student2 : 966544353 */

    }
}
