package ru.javabegin.oop.dz.car;

public interface ICar {
    String getName();
    default void drive(){
        System.out.println(getName() + " drive");
    }
    default void stop(){
        System.out.println(getName() + " stop");
    }
}
