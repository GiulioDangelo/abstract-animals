package org.experis.abstractAnimals;

public class Eagle extends Animal implements CanFly{
    @Override
    public void verso() {
        System.out.println("screeee");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }
}
