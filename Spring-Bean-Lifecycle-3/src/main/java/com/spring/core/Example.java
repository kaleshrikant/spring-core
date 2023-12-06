package com.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    @PostConstruct
    public void start() {
        System.out.println("start () --> @PostConstruct");
    }
    @PreDestroy
    public void end() {
        System.out.println("end() --> @PreDestroy");
    }

    public Example() {
    }

    public Example(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
