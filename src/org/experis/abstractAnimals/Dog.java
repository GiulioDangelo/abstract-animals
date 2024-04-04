package org.experis.abstractAnimals;

public class Dog extends Animal{

    @Override
    public void verso() {
        System.out.println("bau");
    }

    @Override
    public void mangia() {
        System.out.println("cibo per cani");
    }
}
