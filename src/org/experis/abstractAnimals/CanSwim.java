package org.experis.abstractAnimals;

public interface CanSwim {
    public default void swim(){
        System.out.println("Sto nuotando!!!");
    };
}
