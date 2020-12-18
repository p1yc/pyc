package com.pyc;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void BirdTest(){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    @Test
    public void RoosterTest(){
        Rooster rooster = new Rooster();
        rooster.fly();
        rooster.say();
    }

    @Test
    public void ParrotTest(){
        Dog dog = new Dog();
        Parrot parrot = new Parrot(dog);
        parrot.say();
    }
}
