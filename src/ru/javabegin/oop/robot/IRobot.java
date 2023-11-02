package ru.javabegin.oop.robot;

public interface IRobot {
    void move();
    void stop();
    void flight();
    void talk();

    IWing getWing();
    String getName();


}
