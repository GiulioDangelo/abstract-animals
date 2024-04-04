package org.experis.abstractAnimals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Sparrow  sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Dolphin  dolphin = new Dolphin();

        Animal[] list = {dog, sparrow, eagle, dolphin};

        for (Animal animal : list) {
            if (animal instanceof CanFly){
                faiVolare((CanFly) animal);
            } else if (animal instanceof CanSwim) {
                faiNuotare((CanSwim) animal);
            }
        }
    }

    public static void faiVolare(CanFly animal){
        animal.fly();
    };

    public static void faiNuotare(CanSwim animal){
        animal.swim();
    };
}