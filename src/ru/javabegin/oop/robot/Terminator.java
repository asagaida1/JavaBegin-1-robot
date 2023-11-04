package ru.javabegin.oop.robot;

public class Terminator extends ARobot{

    AircraftWing aircraftWing;

    public Terminator() {
    }

    public Terminator(String name, IWing iWing) {
        super(name, iWing);
    }

    @Override
    public void move() {
        System.out.println("Terminator move");
    }

    @Override
    public void stop() {
        System.out.println("Terminator stop");
    }

    @Override
    public void flight() {
        System.out.println("Terminator flight with wing size = " + getiWing().getSize());
    }

    @Override
    public void talk() {
        System.out.println("Terminator talk");
    }

    @Override
    public IWing getWing() {
        return null;
    }

//    @Override
//    public void on() {
//        System.out.println(this.getClass().getSimpleName() + " on");
//    }
//
//    @Override
//    public void off() {
//        System.out.println("off");
//    }

    @Override
    public String toString() {
        return "Terminator{" +
                "name='" + super.getName() + '\'' +
                "wing='" + super.getiWing() + '\'' +
                '}';
    }
}
