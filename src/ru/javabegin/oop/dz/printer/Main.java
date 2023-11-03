package ru.javabegin.oop.dz.printer;

public class Main {
    public static void main(String[] args) {
        IPrinter printer = new Printer(0,3);
        printer.print("abraKadabra");
        printer.print("Hello word");
    }
}
