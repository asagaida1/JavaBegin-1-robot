package ru.javabegin.oop.dz.Computer;

public class Monitor implements IMonitor{
    public Monitor() {
    }

    public Monitor(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
