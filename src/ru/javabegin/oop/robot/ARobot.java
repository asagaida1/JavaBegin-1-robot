package ru.javabegin.oop.robot;

public abstract class ARobot implements IRobot{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ARobot{" +
                "name='" + name + '\'' +
                '}';
    }
}
