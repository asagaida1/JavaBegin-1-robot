package ru.javabegin.oop;

public class Ba {

    public Ba() {
    }

    public Ba(String name) {
        this.name = name;
    }

    private String name;



}
class Da {
    public static void main(String[] args) {
        Ba ba = new Ba();
        ba.toString();

    }
}

