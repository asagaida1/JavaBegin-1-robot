package ru.javabegin.oop.dz.car;

public class Car implements ICar{
    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
