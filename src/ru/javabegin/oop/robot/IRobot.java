package ru.javabegin.oop.robot;

public interface IRobot {
    void move();
    void stop();
    void flight();

    String getName();

    void talk();
}
