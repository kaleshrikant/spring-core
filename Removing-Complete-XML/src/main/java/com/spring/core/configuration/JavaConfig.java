package com.spring.core.configuration;

import com.spring.core.Samosa;
import com.spring.core.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScans(basePackages = "com.spring.core.configuration")
public class JavaConfig {

    @Bean(name = "samosaBean")
    public Samosa getSamosa() {
        return new Samosa();
    }
    @Bean("studentBean")
    public Student getStudent() {
       return new Student("Shrikant","Kale","Amravati", getSamosa());
    }
}
