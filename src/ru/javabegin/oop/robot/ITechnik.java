package ru.javabegin.oop.robot;

public interface ITechnik {
    default void on() {
        System.out.println(this.getClass().getSimpleName() + " default on");
    }

    default void off() {
        on();
        System.out.println(this.getClass().getSimpleName() + " default off");
    }
}
