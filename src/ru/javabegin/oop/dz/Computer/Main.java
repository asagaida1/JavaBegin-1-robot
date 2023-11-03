package ru.javabegin.oop.dz.Computer;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung");

        Computer computer = new Computer("MacBook", monitor);
        computer.on();
        computer.off();

    }
}
