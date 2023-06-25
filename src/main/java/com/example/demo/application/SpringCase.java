package com.example.demo.application;

import com.example.demo.runner.SpringGameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("com.example.demo")
public class SpringCase {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCase.class);
        SpringGameRunner springGameRunner = context.getBean(SpringGameRunner.class);
        springGameRunner.printPlayLog();

//        System.out.println("===== bean list =====");
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
