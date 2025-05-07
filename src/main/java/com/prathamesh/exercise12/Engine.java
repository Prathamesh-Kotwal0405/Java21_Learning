package com.prathamesh.exercise12;

public class Engine {
    private double hp;
    private double cc;

    public Engine(double hp, double cc) {
        this.hp = hp;
        this.cc = cc;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }
}
