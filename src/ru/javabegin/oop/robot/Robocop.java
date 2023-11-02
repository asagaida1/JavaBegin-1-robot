package ru.javabegin.oop.robot;

public class Robocop extends ARobot{

    Wing wing;
    public Robocop() {
    }

    public Robocop(String name, IWing iWing) {
        super(name, iWing);
    }

    @Override
    public void move() {
        System.out.println("Robocop move");

    }

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void flight() {
        System.out.println("Robocop flight with wing size = " + getiWing().getSize());
    }

    @Override
    public void talk() {
        System.out.println("Robocop talk");
    }

    @Override
    public Wing getWing() {
        return wing;
    }

    @Override
    public String toString() {
        return "Robocop{" +
                "name='" + super.getName() + '\'' +
                "wing='" + super.getiWing() + '\'' +
                '}';
    }
}
