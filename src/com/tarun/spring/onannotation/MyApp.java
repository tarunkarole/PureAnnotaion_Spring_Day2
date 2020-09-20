package com.tarun.spring.onannotation;

import com.tarun.spring.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Ludo coach = context.getBean("myLudo" , Ludo.class);

        System.out.println(coach.getLudo());
        System.out.println(coach.getCricket());


    }
}
