package ru.javabegin.oop.robot;

public abstract class ARobot implements IRobot{
    private String name;
    private IWing iWing;

    public ARobot() {
    }

    public ARobot(String name, IWing iWing) {
        this.name = name;
        this.iWing = iWing;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IWing getiWing() {
        return iWing;
    }

    public void setiWing(IWing iWing) {
        this.iWing = iWing;
    }

    @Override
    public String toString() {
        return "ARobot{" +
                "name='" + name + '\'' +
                '}';
    }
}
