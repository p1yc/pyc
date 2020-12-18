package com.pyc;

public class Rooster {
    private Chicken chicken;

    public Rooster(){
        super();
        this.chicken = new Chicken();
    }
    void say() {
        System.out.println("Cock-a-doodle-doo");
    }
    void fly() {
        chicken.fly();
    }

}
