package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class AppRunner {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Demo demoObject = (Demo) applicationContext.getBean("demoObject",Demo.class);
        System.out.println(demoObject);

        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("33+33+33");
        System.out.println("#{ 33+33+33 } --> "+expression.getValue());

    }
}
