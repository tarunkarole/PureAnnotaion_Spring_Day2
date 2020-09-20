package com.tarun.spring.onannotation;

import com.tarun.spring.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        LudoImpl coach = context.getBean("myLudo" , LudoImpl.class);

        System.out.println(coach.getLudo());
        System.out.println(coach.getCricket());
        System.out.println(coach.getName());
        System.out.println(coach.getEmail());


    }
}
