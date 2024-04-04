package org.experis.abstractAnimals;

public class Sparrow extends Animal implements CanFly{

    @Override
    public void verso() {
        System.out.println("cip-cip");
    }

    @Override
    public void mangia() {
        System.out.println("semi");
    }
}
