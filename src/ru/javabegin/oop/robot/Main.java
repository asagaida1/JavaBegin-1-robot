package ru.javabegin.oop.robot;

public class Main {
    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(20);
        aircraftWing.open();

        Robocop robocop = new Robocop();
        Terminator terminator = new Terminator("term", new LittleWing(10));

        robocop.setName("robo");
        robocop.setiWing(aircraftWing);
//        terminator.setName("term");

        robocop.move();
        robocop.stop();
        robocop.flight();
        robocop.talk();
        robocop.off();

        terminator.move();
        terminator.stop();
        terminator.flight();
        terminator.talk();
        terminator.on();


        System.out.println(robocop);
        System.out.println(terminator);

    }
}
