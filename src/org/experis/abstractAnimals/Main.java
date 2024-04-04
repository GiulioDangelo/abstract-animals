package org.experis.abstractAnimals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Sparrow  sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Dolphin  dolphin = new Dolphin();

        faiVolare(sparrow);
        faiNuotare(dolphin);
    }

    public static void faiVolare(CanFly animal){
        animal.fly();
    };

    public static void faiNuotare(CanSwim animal){
        animal.swim();
    };
}