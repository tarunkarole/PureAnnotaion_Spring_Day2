package com.tarun.spring.onannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class LudoImpl implements Ludo {


    private CricketCoach cricketCoach;

    @Value("${foo.name}")
    private String name;

    @Value("${foo.email}")
    private  String email;

    public LudoImpl(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @Override
    public String getLudo() {
        return "Practice daily Ludo...";
    }

    @Override
    public String getCricket() {
        return cricketCoach.getCricket();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
