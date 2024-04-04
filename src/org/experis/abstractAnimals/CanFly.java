package org.experis.abstractAnimals;

public interface CanFly {
    public default void fly(){
        System.out.println("Sto volando!!!");
    };
}
