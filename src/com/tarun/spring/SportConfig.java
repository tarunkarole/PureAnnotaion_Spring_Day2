package com.tarun.spring;


import com.tarun.spring.onannotation.CricketCoach;;
import com.tarun.spring.onannotation.CricketCoachImpl;
import com.tarun.spring.onannotation.Ludo;
import com.tarun.spring.onannotation.LudoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:sports.properties")
public class SportConfig {

    @Bean
    public CricketCoach myCricketCoach(){
        return new CricketCoachImpl();
    }

    @Bean
    public Ludo myLudo(){
        return new LudoImpl(myCricketCoach());
    }



}
