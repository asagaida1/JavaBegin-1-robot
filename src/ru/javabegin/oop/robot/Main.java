package ru.javabegin.oop.robot;

public class Main {
    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(20);
        aircraftWing.open();

        Robocop robocop = new Robocop();
        Terminator terminator = new Terminator("term", new LittleWing(10));

        IRobot roboCopInterface = new Robocop();
        ((Robocop)roboCopInterface).takeGun(); // без присвоения переменной
        Robocop robocopTrue = ((Robocop) roboCopInterface);
        robocopTrue.takeGun();



        robocop.setName("robo");
        robocop.setiWing(aircraftWing);
//        terminator.setName("term");

        robocop.move();
        robocop.stop();
        robocop.flight();
        robocop.talk();
        robocop.off();
        robocop.takeGun();

        terminator.move();
        terminator.stop();
        terminator.flight();
        terminator.talk();
        terminator.on();

        System.out.println(robocop);
        System.out.println(terminator);

    }
}
