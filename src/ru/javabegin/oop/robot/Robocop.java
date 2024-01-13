package ru.javabegin.oop.robot;

public class Robocop extends ARobot{

    AircraftWing aircraftWing;
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
    public AircraftWing getWing() {
        return aircraftWing;
    }

    void takeGun(){
        System.out.println("RoboCop take gun");
    }

    void takeGun(int second){
        System.out.println(String.format("RoboCop take gun in %d second", second));
    }

    void takeGun(int second, String speech){
        System.out.println(String.format("RoboCop take gun in %d second and speech %s", second, speech));
    }

    @Override
    public String toString() {
        return "Robocop{" +
                "name='" + super.getName() + '\'' +
                "wing='" + super.getiWing() + '\'' +
                '}';
    }
}
