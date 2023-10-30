package ru.javabegin.oop.robot;

public class Main {
    public static void main(String[] args) {

        Robocop robocop = new Robocop();
        Terminator terminator = new Terminator();

        robocop.setName("robo");
        terminator.setName("term");

        robocop.move();
        robocop.stop();
        robocop.flight();
        robocop.talk();

        terminator.move();
        terminator.stop();
        terminator.flight();
        terminator.talk();

        System.out.println(robocop);
        System.out.println(terminator);

    }
}
