package ru.javabegin.oop.robot;

public class Main {
    public static void main(String[] args) {

        Wing wing = new Wing();
        wing.setSize(20);
        wing.open();

        Robocop robocop = new Robocop();
        Terminator terminator = new Terminator("term",wing);

        robocop.setName("robo");
        robocop.setiWing(wing);
//        terminator.setName("term");

        robocop.move();
        robocop.stop();
        robocop.flight();
        robocop.talk();

        terminator.move();
        terminator.stop();
        terminator.flight();
        terminator.talk();
        terminator.on();


        System.out.println(robocop);
        System.out.println(terminator);

    }
}
