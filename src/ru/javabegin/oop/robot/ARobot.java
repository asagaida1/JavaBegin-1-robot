package ru.javabegin.oop.robot;

public abstract class ARobot implements IRobot{
    private String name;

    public ARobot() {
    }

    public ARobot(String name) {
        this.name = name;
    }

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
