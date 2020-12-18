package com.pyc;

public class Parrot extends Bird {
    private OtherAnimal animal;

    public Parrot(OtherAnimal animal){
        super();
        this.animal = animal;
    }
    void say() {
        animal.say();
    }

}
