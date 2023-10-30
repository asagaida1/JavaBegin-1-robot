package ru.javabegin.oop.robot;

public class Robocop extends ARobot{

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
        System.out.println("Robocop flight");
    }

    @Override
    public void talk() {
        System.out.println("Robocop talk");
    }

    @Override
    public String toString() {
        return "Robocop{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
