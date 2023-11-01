package ru.javabegin.oop.robot;

public class Main {
    public static void main(String[] args) {

        Robocop robocop = new Robocop("robo");
        Terminator terminator = new Terminator("term");

//        robocop.setName("robo");
//        terminator.setName("term");

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
