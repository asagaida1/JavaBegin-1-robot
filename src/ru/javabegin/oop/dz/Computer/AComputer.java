package ru.javabegin.oop.dz.Computer;

public abstract class AComputer implements IComputer{
    String name;
    Monitor monitor;

    public AComputer() {
    }

    public AComputer(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + getName() + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + getName() + ", используется монитор " + monitor.getName());
    }
}
