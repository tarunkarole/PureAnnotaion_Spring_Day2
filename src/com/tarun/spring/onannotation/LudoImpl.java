package com.tarun.spring.onannotation;

import org.springframework.beans.factory.annotation.Autowired;


public class LudoImpl implements Ludo {


    private CricketCoach cricketCoach;

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
}
