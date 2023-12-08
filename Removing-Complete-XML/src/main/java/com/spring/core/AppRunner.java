package com.spring.core;

import com.spring.core.configuration.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        /*
            Student studentBeanUsingComponent = (Student) applicationContext.getBean("studentBean",Student.class);
            System.out.println(studentBeanUsingComponent);
        */

        Student studentBeanUsingBean = (Student) applicationContext.getBean("studentBean",Student.class);
        System.out.println(studentBeanUsingBean);
        studentBeanUsingBean.study();

    }
}
