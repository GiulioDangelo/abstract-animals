package org.experis.abstractAnimals;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void verso() {
        System.out.println("eeee");
    }

    @Override
    public void mangia() {
        System.out.println("pesci");
    }
}
